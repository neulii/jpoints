package jpoints;

/**
 * Entity Class for Player
 * 
 * @author neulii
 *
 */

public class Player {
	
	/**
	 * Name of the Player
	 */
	String name;
	
	/**
	 * points of the Player
	 */
	int points;
	
	/**
	 * 
	 * @param name the name of the player
	 */
	public Player(String name)
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @param name the name of the Player
	 * @param points points of the Player
	 */
	public Player(String name, int points)
	{
		this(name);
		this.points = points;
	}
	
	/**
	 * get the name of the Player
	 * @return the name of the player
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return the points of the player
	 */
	public int getPoints()
	{
		return points;
	}
	
	/**
	 * add points to the actual points 
	 * @param points points to be added
	 */
	public void addPoints(int points)
	{
		this.points+=points;
	}

}
