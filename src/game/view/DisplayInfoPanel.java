package game.view;

import game.controller.GameController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DisplayInfoPanel extends JPanel
	{
		private GameController baseController;
		private SpringLayout baseLayout;
		
		private JTextArea difficultyText;
		private JTextArea winTextBox;
		
		public DisplayInfoPanel(GameController baseController)
		{
			this.baseController = baseController;
			
			baseLayout = new SpringLayout();
			
			difficultyText = new JTextArea(2,2);
			difficultyText.setEditable(false);
			difficultyText.setText("Select A Difficulty!");
			
			winTextBox = new JTextArea();
			winTextBox.setEditable(false);
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.CYAN);
			setPreferredSize(new Dimension(250,230));
			
			setLayout(baseLayout);
			add(difficultyText);
			add(winTextBox);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, winTextBox, -66, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, winTextBox, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, winTextBox, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, winTextBox, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.WEST, difficultyText, 0, SpringLayout.WEST, winTextBox);
			baseLayout.putConstraint(SpringLayout.SOUTH, difficultyText, -116, SpringLayout.NORTH, winTextBox);
			baseLayout.putConstraint(SpringLayout.EAST, difficultyText, 0, SpringLayout.EAST, winTextBox);
			baseLayout.putConstraint(SpringLayout.NORTH, difficultyText, 10, SpringLayout.NORTH, this);
		}
		
		private void buildListeners()
		{
		}
		
		public void setText(String input)
		{
			winTextBox.setText(input);
		}
		
		public void setDifficultyText(String input)
		{
			difficultyText.setText("Game Mode Selected : \n" + input);
		}
		
	}
