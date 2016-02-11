package game.controller;

import game.model.EasyMode;
import game.model.NormalMode;
import game.view.GameFrame;

public class GameController
	{
		private EasyMode easyMode;
		private NormalMode normalMode;
		private GameFrame baseFrame;
		private int userGuess;
		private int selectedDiff;
		private String winnerText;
		private String difficultyText;
		
		public GameController()
		{
			baseFrame = new GameFrame(this);
			easyMode = new EasyMode(this);
			normalMode = new NormalMode(this);
		}
		
		public void start(){	}
		
		/**
		 * Checks if the user clicked on the Easy, Normal, or Hard Button.
		 * @param selectedDiff = Sets to 1 if Easy. Sets to 2 if Normal. Sets to 3 if Hard.
		 */
		public void setDifficulty(int selectedDiff)
		{
			this.selectedDiff = selectedDiff;
			if(selectedDiff == 1)
				easyMode.generateEasyNumber();
			else if(selectedDiff == 2)
				normalMode.generateNormalNumber();
			else if(selectedDiff == 3)
				System.out.println("Hard");
		}
		
		public void checkAnswerUpdateText()
			{
				if(selectedDiff == 1)
					{
						easyMode.checkAnswer();
						baseFrame.getBasePanel().getDisplayInfo().setText(winnerText);
					}
				else if(selectedDiff == 2)
					{
						normalMode.checkAnswer();
						baseFrame.getBasePanel().getDisplayInfo().setText(winnerText);
					}
				else if(selectedDiff == 3)
					System.out.println("Hard");
				
				
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
		
		public String getDifficultyText()
		{
			return difficultyText;
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
		
		public void setDifficultyText(String difficultyText)
		{
			this.difficultyText = difficultyText;
			baseFrame.getBasePanel().getDisplayInfo().setDifficultyText(difficultyText);
		}
	}
