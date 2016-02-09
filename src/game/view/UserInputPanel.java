package game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UserInputPanel extends JPanel
	{
		private DifficultyPanel grabDiff;
		private SpringLayout baseLayout;
		
		private JTextField userGuessField;
		private JButton enterInputButton;
		
		private int userGuess;
		
		//Class that needs the random Number
		public UserInputPanel() 
		{
			grabDiff = new DifficultyPanel();
			
			baseLayout = new SpringLayout();
			
			userGuessField = new JTextField(2);
			enterInputButton = new JButton("Enter Guess");
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.RED);
			setPreferredSize(new Dimension(200,200));
			setLayout(baseLayout);
			add(userGuessField);
			add(enterInputButton);
		}
		
		private void buildWindow()
		{
			
		}
		
		private void buildListeners()
		{
			enterInputButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent clicked)
					{
						parseInput();
						System.out.println("MY INPUT " + userGuess);
						
						//This line prints it to 0
						System.out.println("GEN NUM : " + grabDiff.getSelectedNumber());
					}
				});
		}
		
		private void parseInput()
		{
			userGuess = Integer.parseInt(userGuessField.getText());
		}
	}
