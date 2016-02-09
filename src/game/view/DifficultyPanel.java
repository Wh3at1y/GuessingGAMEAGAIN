package game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		
		private int selectedNumber;
		
		public DifficultyPanel()
		{
			baseLayout = new SpringLayout();
			
			easyButton = new JButton("Easy");
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setBackground(Color.BLUE);
			setPreferredSize(new Dimension(200,200));
			
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
						selectedNumber = (int) (Math.random() * 51);
						System.out.println(selectedNumber);
					}
				});
		}
		
		public int getSelectedNumber()
		{
			System.out.println(selectedNumber);
			return this.selectedNumber;
		}
	}
