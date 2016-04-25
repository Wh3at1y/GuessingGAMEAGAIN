package game.controller;

import java.net.MalformedURLException;

public class GameRunner
	{
		public static void main(String[]args) throws MalformedURLException
		{
			GameController startController = new GameController();
			startController.start();
		}
	}
