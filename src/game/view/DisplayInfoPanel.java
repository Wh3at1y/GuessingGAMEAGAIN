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
		
		private JTextArea winTextBox;
		
		public DisplayInfoPanel(GameController baseController)
		{
			this.baseController = baseController;
			
			baseLayout = new SpringLayout();
			
			winTextBox = new JTextArea();
			winTextBox.setEditable(false);
			winTextBox.setText(baseController.getWinnerText());
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.CYAN);
			setPreferredSize(new Dimension(250,230));
			
			setLayout(baseLayout);
			add(winTextBox);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, winTextBox, -66, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, winTextBox, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, winTextBox, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, winTextBox, -10, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
		}
		
	}
