package com.tergai.game;

import java.io.IOException;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tergai.game.save.FileSaver;
import com.tergai.game.save.SaveData;
import com.tergai.game.save.SaveData.EnumDataType;

public class Tergai extends ApplicationAdapter {
	public SpriteBatch batch;
	public Texture img;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		FileSaver.saveData(new SaveData(EnumDataType.STRING, "Test1", "", "testSave.tsave", "first1"));
		FileSaver.saveData(new SaveData(EnumDataType.STRING, "test2@@@@", "", "testSave.tsave", "first2"));
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
