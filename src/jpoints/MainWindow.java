package jpoints;
import jpoints.Listener.MainWindowMenuListener;

import javax.swing.*;

public class MainWindow {

    JFrame mainWindow;

    //menus
    JMenuBar menuBar;
    JMenu gameMenu;
    
    MainGamePanel mainGamePanel;

    Game game;

    MainWindowMenuListener menuActionListener;

    public MainWindow(int width, int height){

        mainWindow = new JFrame("JPoints");
        mainWindow.setSize(700,500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Spiel");
        JMenu infoMenu = new JMenu("Info");

        menuBar.add(gameMenu);
        menuBar.add(infoMenu);

        JMenuItem newGame= new JMenuItem("Neues Spiel");
        JMenuItem exit = new JMenuItem("Beenden");

        JMenuItem info = new JMenuItem("Info");


        gameMenu.add(newGame);
        gameMenu.add(exit);


        infoMenu.add(info);

        menuActionListener = new MainWindowMenuListener(this, game);

        newGame.addActionListener(menuActionListener);
        exit.addActionListener(menuActionListener);
        info.addActionListener(menuActionListener);



        mainWindow.setJMenuBar(menuBar);
        
      

    }

    public JFrame getFrame()
    {
    	return mainWindow;
    }
    
    //TODO show mainpanel
    public void showMainGamePanel()
    {
    	
    	mainGamePanel = new MainGamePanel(game);
    	
    	//mainWindow.add(mainGamePanel);
    	
    	
    }
    

    public void show(){
        mainWindow.setVisible(true);
    }
    
    public Game getGame()
    {
    	return game;
    	
    }

	public void setGame(Game newGame) {
		game = newGame;
		
	}

}
