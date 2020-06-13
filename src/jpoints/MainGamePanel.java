package jpoints;

import javax.swing.JPanel;

public class MainGamePanel extends JPanel {

	
	private static final long serialVersionUID = -8749292918188412931L;

	Game game;
	PlayerInputPanel pOnePoints;
	PlayerInputPanel pTwoPoints;
	
	//TODO mainpanel gehoert noch gemacht
	public MainGamePanel(Game game)
	{
		this.game = game;
		setLayout(null);
		
		pOnePoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(0).getName(), 20);
		pOnePoints.setLocation(20, 50);
		this.add(pOnePoints);
		
		
		pTwoPoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(1).getName(), 20);
		pTwoPoints.setLocation(20, 120);
		this.add(pTwoPoints);
		
	}
}
