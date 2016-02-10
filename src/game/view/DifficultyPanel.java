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
		
		public DifficultyPanel(GameController baseController)
		{
			this.baseController = baseController;
			baseLayout = new SpringLayout();
			
			easyButton = new JButton("Easy");
			
			
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
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, easyButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, easyButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, easyButton, 58, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, easyButton, -10, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
			easyButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.setDifficulty(1);
					}
				});
		}
	}
