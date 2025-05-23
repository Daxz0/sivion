package com.siviongame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.siviongame.sivion;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();



		config.setForegroundFPS(60);
		config.setTitle("Sivion v0.0");
		config.setWindowedMode(800,400);


		new Lwjgl3Application(new sivion(), config);
	}
}
