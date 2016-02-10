package game.view;

import game.controller.GameController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecipePanel extends JPanel
	{
		private GameController baseController;
		private SpringLayout baseLayout;
		
		private JButton clearButton;
		
		public RecipePanel(GameController baseController)
		{
			this.baseController = baseController;
			baseLayout = new SpringLayout();
			
			clearButton = new JButton("Clear");
			
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.GREEN);
			setPreferredSize(new Dimension(150,500));
			
			setLayout(baseLayout);
			add(clearButton);
		}
		
		private void buildWindow()
		{
		}
		
		private void buildListeners()
		{
			clearButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
					}
				});
		}
	}
