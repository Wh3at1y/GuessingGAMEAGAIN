package game.view;

import game.controller.GameController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private GameController baseController;
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		private JButton normalButton;
		private JButton hardButton;
		
		public DifficultyPanel(GameController baseController)
		{
			this.baseController = baseController;
			baseLayout = new SpringLayout();
			
			easyButton = new JButton("Easy");
			normalButton = new JButton("Normal");
			hardButton = new JButton("Hard");
			
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.BLUE);
			setPreferredSize(new Dimension(200,300));
			
			setLayout(baseLayout);
			add(easyButton);
			add(normalButton);
			add(hardButton);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, easyButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, easyButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, easyButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, hardButton, 214, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, hardButton, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, normalButton, -18, SpringLayout.NORTH, hardButton);
			baseLayout.putConstraint(SpringLayout.WEST, hardButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, hardButton, 0, SpringLayout.EAST, easyButton);
			baseLayout.putConstraint(SpringLayout.NORTH, normalButton, 19, SpringLayout.SOUTH, easyButton);
			baseLayout.putConstraint(SpringLayout.WEST, normalButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, normalButton, 0, SpringLayout.EAST, easyButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, easyButton, 86, SpringLayout.NORTH, this);
		}
		
		private void buildListeners()
		{
			easyButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.setDifficulty(1);
						baseController.setDifficultyText("Easy");
					}
				});
			
			normalButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.setDifficulty(2);
						baseController.setDifficultyText("Normal");
					}
				});
			
			hardButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.setDifficulty(3);
						baseController.setDifficultyText("Hard");
					}
				});
		}
	}
