package game.controller;

import game.model.EasyMode;
import game.view.GameFrame;

public class GameController
	{
		private EasyMode easyMode;
		private GameFrame baseFrame;
		private int userGuess;
		private String winnerText;
		
		public GameController()
		{
			baseFrame = new GameFrame(this);
			easyMode = new EasyMode(this);
		}
		
		public void start(){	}
		
		/**
		 * Checks if the user clicked on the Easy, Normal, or Hard Button.
		 * @param selectedDiff = Sets to 1 if Easy. Sets to 2 if Normal. Sets to 3 if Hard.
		 */
		public void setDifficulty(int selectedDiff)
		{
			if(selectedDiff == 1)
				easyMode.generateEasyNumber();
			else if(selectedDiff == 2)
				System.out.println("Normal");
			else if(selectedDiff == 3)
				System.out.println("Hard");
		}
		
		public void checkAnswer()
			{
				easyMode.checkAnswer();
				baseFrame.getBasePanel().getDisplayInfo();
			}
		
		/**
		 * Getters section
		 * @return returns what the user guesses.
		 */
		public int getUserGuess()
			{
				return userGuess;
			}
		
		public String getWinnerText()
		{
			return winnerText;
		}
		
		/**
		 * Setters section
		 * @param setUserGuess sets what they guess, into the userGuess variable.
		 */
		public void setUserGuess(int setUserGuess)
		{
			this.userGuess = setUserGuess;
		}
		
		public void setWinnerText(String winnerText)
		{
			this.winnerText = winnerText;
		}
	}
