package com.tergai.game.save;

public class SaveData {

	protected EnumDataType type = EnumDataType.BYTE;
	protected Object obj;
	protected String ObjectName;
	protected String Path;
	protected String Filename;

	public SaveData(EnumDataType type, Object obj, String path, String filename, String objname) {
		super();
		this.type = type;
		this.obj = obj;
		Path = path;
		Filename = filename;
		this.ObjectName = objname;
	}

	public String getObjectName() {
		return ObjectName;
	}

	public EnumDataType getType() {
		return type;
	}



	public void setType(EnumDataType type) {
		this.type = type;
	}



	public Object getObj() {
		return obj;
	}



	public void setObj(Object obj) {
		this.obj = obj;
	}



	public String getPath() {
		return Path;
	}



	public void setPath(String path) {
		Path = path;
	}



	public String getFilename() {
		return Filename;
	}



	public enum EnumDataType {
		BYTE,
		INT,
		FLOAT,
		STRING,
		LONG,
		SHORT,
		LIST;
	}
	
}
