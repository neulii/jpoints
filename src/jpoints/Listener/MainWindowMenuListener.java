package jpoints.Listener;
import jpoints.Game;
import jpoints.MainWindow;
import jpoints.NewGameWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowMenuListener implements ActionListener {

    JFrame window;
    Game game;
    MainWindow mainWindow;
    
    public MainWindowMenuListener(MainWindow window, Game game) {
    	this.window = window.getFrame();
    	this.game = game;
    	this.mainWindow = window;
    }

    public void actionPerformed(ActionEvent e)
    {
    	
    	//get text from menuItem
        String text = ((JMenuItem)(e.getSource())).getText();

        switch (text)
        {
            case "Neues Spiel":
            	               
            	NewGameWindow newGameWindow = new NewGameWindow(mainWindow);
            	         
            	game = newGameWindow.showModal();
            	
            	break;


            case "Beenden":


               window.dispose();

                break;

            case "Info":
            	//TODO info listener
                //JOptionPane.showMessageDialog(null,"info");

                break;

        }
    }
}
