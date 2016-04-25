package game.view;

import java.io.File;
import java.net.MalformedURLException;
import game.controller.GameController;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame
	{
		private GamePanel basePanel;
		
		public GameFrame(GameController baseController) throws MalformedURLException
		{
			basePanel = new GamePanel(baseController);
			buildFrame();
		}
		
		private void buildFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(600,500);
			this.setResizable(false);
			this.setTitle("Guessing Game");
			this.setContentPane(basePanel);
			this.setVisible(true);
		}

		public GamePanel getBasePanel()
			{
				return basePanel;
			}
	}
