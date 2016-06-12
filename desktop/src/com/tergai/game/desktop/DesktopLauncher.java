package com.tergai.game.desktop;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tergai.game.Tergai;

public class DesktopLauncher {
	public static void main (String[] arg) {
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	        cfg.width = (int) (screen.width*0.4427083333);
	        cfg.height = (int) (screen.height*0.5);
	        cfg.resizable = false;
		new LwjglApplication(new Tergai(), cfg);
	}
}
