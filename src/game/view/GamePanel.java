package game.view;

import javax.swing.*;

public class GamePanel extends JPanel
	{
		private DifficultyPanel grabDifficulty;
		private UserInputPanel userPanel;
		
		private SpringLayout baseLayout;
		
		public GamePanel()
		{
			grabDifficulty = new DifficultyPanel();
			userPanel = new UserInputPanel();
			
			baseLayout = new SpringLayout();
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setLayout(baseLayout);
			add(grabDifficulty);
			add(userPanel);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.WEST, grabDifficulty, 0, SpringLayout.EAST, userPanel);
		}
		
		private void buildListeners()
		{
			
		}
	}
