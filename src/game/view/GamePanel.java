package game.view;

import java.net.MalformedURLException;
import game.controller.GameController;
import javax.swing.*;

public class GamePanel extends JPanel
	{
		private DifficultyPanel grabDifficulty;
		private UserInputPanel userPanel;
		private RecipePanel recipePanel;
		private DisplayInfoPanel displayInfo;
		private MoreOptionsPanel optionsPanel;
		
		private SpringLayout baseLayout;
		
		public GamePanel(GameController baseController) throws MalformedURLException
		{	
			grabDifficulty = new DifficultyPanel(baseController);
			userPanel = new UserInputPanel(baseController);
			recipePanel = new RecipePanel(baseController);
			displayInfo = new DisplayInfoPanel(baseController);
			optionsPanel = new MoreOptionsPanel(baseController);
			
			baseLayout = new SpringLayout();
			baseLayout.putConstraint(SpringLayout.SOUTH, optionsPanel, 0, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, optionsPanel, 0, SpringLayout.EAST, this);
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setLayout(baseLayout);
			add(grabDifficulty);
			add(userPanel);
			add(recipePanel);
			add(displayInfo);
			add(optionsPanel);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.EAST, userPanel, 0, SpringLayout.WEST, grabDifficulty);
			baseLayout.putConstraint(SpringLayout.EAST, grabDifficulty, 0, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, displayInfo, 0, SpringLayout.SOUTH, userPanel);
			baseLayout.putConstraint(SpringLayout.EAST, displayInfo, 0, SpringLayout.WEST, grabDifficulty);
		}
		
		private void buildListeners()
		{
			
		}

		public DifficultyPanel getGrabDifficulty()
			{
				return grabDifficulty;
			}

		public UserInputPanel getUserPanel()
			{
				return userPanel;
			}

		public RecipePanel getRecipePanel()
			{
				return recipePanel;
			}

		public DisplayInfoPanel getDisplayInfo()
			{
				return displayInfo;
			}

		public MoreOptionsPanel getOptionsPanel()
			{
				return optionsPanel;
			}
	}
