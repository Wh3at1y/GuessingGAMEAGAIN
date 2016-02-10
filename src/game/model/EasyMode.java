package game.model;

import game.controller.GameController;

public class EasyMode
	{
		private GameController baseController;
		private int easyNumber;
		
		public EasyMode(GameController baseController)
		{
			this.baseController = baseController;
		}
		
		public int generateEasyNumber()
		{
			easyNumber = 0;
			easyNumber = (int) (Math.random() * 51);
			System.out.println(easyNumber);
			
			return easyNumber;
		}
		
		public void checkAnswer()
		{
			if(baseController.getUserGuess() == easyNumber)
				{
					baseController.setWinnerText("You did it! Winner!");	
				}
			else
				{
					baseController.setWinnerText("Incorrect. Try again!");
				}
		}
	}
