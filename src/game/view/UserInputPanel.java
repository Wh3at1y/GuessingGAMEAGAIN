package game.view;

import game.controller.GameController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UserInputPanel extends JPanel
	{
		private GameController baseController;
		
		private SpringLayout baseLayout;
		
		private JTextField userGuessField;
		private JButton enterInputButton;
		
		private int userGuess;
		
		//Class that needs the random Number
		public UserInputPanel(GameController baseController) 
		{
			this.baseController = baseController;
			
			baseLayout = new SpringLayout();
			
			userGuessField = new JTextField();
			enterInputButton = new JButton("Enter Guess");
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.RED);
			setPreferredSize(new Dimension(250,70));
			setLayout(baseLayout);
			add(userGuessField);
			add(enterInputButton);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, enterInputButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, enterInputButton, 6, SpringLayout.EAST, userGuessField);
			baseLayout.putConstraint(SpringLayout.SOUTH, enterInputButton, 60, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, enterInputButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, userGuessField, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, userGuessField, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, userGuessField, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, userGuessField, -175, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
			enterInputButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent clicked)
					{
						parseInput();
						baseController.setUserGuess(userGuess);
						//Checks the user answer and updates the text box.
						baseController.checkAnswerUpdateText();
					}
				});
		}
		
		private void parseInput()
		{
			userGuess = Integer.parseInt(userGuessField.getText());
		}
	}
