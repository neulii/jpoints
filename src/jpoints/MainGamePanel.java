package jpoints;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class MainGamePanel extends JPanel {

	
	private static final long serialVersionUID = -8749292918188412931L;
	
	Game game;
	PlayerInputPanel pOnePoints;
	PlayerInputPanel pTwoPoints;
	
	JTable table;
	
	JLabel pointDisplay;

	JPanel leftPanel;
	JPanel rightPanel;
	
	//TODO mainpanel gehoert noch gemacht
	public MainGamePanel(Game game)
	{
		this.game = game;
		setLayout(new GridLayout(1, 2));
		
		//Leftpanel
		leftPanel = new JPanel();
		//leftPanel.setBackground(Color.red);
		leftPanel.setLayout(new GridLayout(3,1));
		
		
		
		//rightpanel
		rightPanel = new JPanel();
		//rightPanel.setBackground(Color.blue);
		rightPanel.setLayout(new GridLayout(1,1));
		
		this.add(leftPanel);
		this.add(rightPanel);
		
		
		
		pointDisplay = new JLabel("Points: " + game.getPointDiffToWin() + " / " + game.getActualPointDiff());
		pointDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		pointDisplay.setFont(new Font(pointDisplay.getName(), Font.PLAIN, 30));
	
		
		leftPanel.add(pointDisplay);
		
		
		
		pOnePoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(0).getName(), 20);
		pOnePoints.setLocation(20, 50);
		leftPanel.add(pOnePoints);
		
		pTwoPoints = new PlayerInputPanel(100, 200, 40, game.getPlayers().elementAt(1).getName(), 20);
		pTwoPoints.setLocation(20, 120);
		leftPanel.add(pTwoPoints);
		
		//headers for the table
        String[] columns = new String[] {
            "Runde" ,game.getPlayers().elementAt(0).getName(),game.getPlayers().elementAt(1).getName() , "Differenz"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
//            {1, "John", 40.0, false },
//            {2, "Rambo", 70.0, false },
//            {3, "Zorro", 60.0, true },
        };
        //create table with data
        table = new JTable(data, columns);
        //table.setBounds(100, 200, 200, 100);
       
        
         
        JScrollPane pane = new JScrollPane(table);
        
      
        //add the table to the frame
        rightPanel.add(pane);
          
       
        
	}
}
