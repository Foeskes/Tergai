package com.tergai.game.save;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
	
	public static int saveData(SaveData data) {
		
		File file = new File(data.Path+data.Filename);
		
		BufferedWriter Fwriter;
		try {
			Fwriter = new BufferedWriter(new FileWriter(file, true));
			if (!file.exists()) {
				Fwriter.write("");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int nameLength = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
		    for(String line; (line = br.readLine()) != null; ) {
		       
		    	if (line.startsWith("<"+data.ObjectName+">") && line.endsWith("<"+data.ObjectName+">")) {
		    		
		    		File tempFile = new File(data.Path+data.Filename);
		    		removeLine(file, tempFile, line);
		    		break;
		    		
		    	}
		    	
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			String name ="<"+data.ObjectName+">";
			writer.append(name+data.obj);
			nameLength = name.length();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return nameLength;
		
	}
	
	private static boolean removeLine(File real, File temp, String remove) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(real));
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp));


		String currentLine;

		while((currentLine = reader.readLine()) != null) {
		    // trim newline when comparing with lineToRemove
		    String trimmedLine = currentLine.trim();
		    if(trimmedLine.equals(remove)) continue;
		    writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close(); 
		reader.close(); 
		boolean successful = temp.renameTo(real);
		
		return successful;
		
	}

}
