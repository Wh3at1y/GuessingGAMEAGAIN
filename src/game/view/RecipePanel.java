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
			
			clearButton = new JButton("Cleaopijoijr");
			
			
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
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(RecipePanel.class.getResource("/game/view/singapore.jpg")));
			baseLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 1, SpringLayout.SOUTH, clearButton);
			baseLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 362, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 150, SpringLayout.WEST, this);
			add(lblNewLabel);
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
