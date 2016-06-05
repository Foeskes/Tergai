package com.tergai.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tergai.game.Tergai;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		 cfg.title = "AnimalFlip";
	        cfg.width = 850;
	        cfg.height = 540;
	        cfg.resizable = false;
	        //cfg.addIcon("data/ic_launcher.png", Files.FileType.Internal);
		new LwjglApplication(new Tergai(), cfg);
	}
}
