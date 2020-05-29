package jpoints;

import java.util.Vector;

/**
 * Game class 
 * @author neulii
 *
 */
public class Game {
	
	/**
	 * vector of Players
	 */
	private Vector<Player> players;
	
	/**
	 * number of rounds that are played
	 */
	private int roundNumber;

	/**
	 * points to be ahead for winning the game
	 */
	private int pointDiffToWin;
	
	
	/**
	 * 
	 * @param pointDiffToWin point difference for winning the game
	 */
	public Game(int pointDiffToWin)
	{
		this.pointDiffToWin = pointDiffToWin;	
		players = new Vector<Player>();
		
	}
	
	/**
	 * 
	 * @param players vector with players
	 * @param pointDiffToWin point difference for winning
	 */
	public Game(Vector<Player> players, int pointDiffToWin)
	{
		this(pointDiffToWin);
		this.players = players;
		roundNumber = 0;
		
	}
	
	/**
	 * add a player
	 * @param p player object
	 */
	public void addPlayer(Player p)
	{
		players.add(p);
	}
	
	/**
	 * 
	 * @return the roundNumber
	 */
	public int getRoundNumber()
	{
		return roundNumber;
	}
	
	/**
	 * 
	 * @return the pointdifference to win the game 
	 */
	public int getPointDiffToWin()
	{
		return pointDiffToWin;
	}
	
	/**
	 * new toString method
	 */
	public String toString()
	{
		String gameString = "";
		
		for(int i = 0; i<players.size();i++)
		{
			gameString += players.elementAt(i).getName();
			gameString = gameString +  ": " + players.elementAt(i).getPoints() + " / ";
			
		}
		
		gameString += Integer.toString(pointDiffToWin);
		gameString += " to Win /";
		
		
		return gameString;
	}
	
	/**
	 * 
	 * @return the vector with the players
	 */
	public Vector<Player> getPlayers()
	{
		return players;
		
	}
}
