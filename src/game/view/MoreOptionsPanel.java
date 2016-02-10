package game.view;

import game.controller.GameController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MoreOptionsPanel extends JPanel
	{
		private GameController baseController;
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		
		public MoreOptionsPanel(GameController baseController)
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
			setBackground(Color.GRAY);
			setPreferredSize(new Dimension(450,178));
			
			setLayout(baseLayout);
			add(easyButton);
		}
		
		private void buildWindow()
		{
		}
		
		private void buildListeners()
		{
			easyButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
					}
				});
		}
	}
