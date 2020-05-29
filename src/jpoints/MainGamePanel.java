package jpoints;

import javax.swing.JPanel;

public class MainGamePanel extends JPanel {

	Game game;
	PlayerInputPanel pOnePoints;
	PlayerInputPanel pTwoPoints;
	
	
	public MainGamePanel(Game game)
	{
		this.game = game;
		setLayout(null);
		
		
	
		System.out.println(game);
		
//		pOnePoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(0).getName(), 20);
//		pOnePoints.setLocation(50, 50);
//		
//		pTwoPoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(1).getName(), 20);
//		pOnePoints.setLocation(50, 90);
		
	}
}
