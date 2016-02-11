package game.model;

import game.controller.GameController;

public class NormalMode
	{
		private GameController baseController;
		private int normalNumber;

		public NormalMode(GameController baseController)
		{
			this.baseController = baseController;
		}
		
		public int generateNormalNumber()
		{
			normalNumber = 0;
			normalNumber = (int) (Math.random() * 201);
			System.out.println(normalNumber);
			
			return normalNumber;
		}
		
		public void checkAnswer()
		{
			if(baseController.getUserGuess() == normalNumber)
				{
					baseController.setWinnerText("You did it! Winner!");	
				}
			else
				{
					baseController.setWinnerText("Incorrect. Try again!");
				}
		}
	}
