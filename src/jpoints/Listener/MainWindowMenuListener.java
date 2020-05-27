package jpoints.Listener;
import jpoints.Game;
import jpoints.NewGameWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowMenuListener implements ActionListener {

    JFrame window;
    Game game;
    
    public MainWindowMenuListener(JFrame window, Game game) {
    	this.window = window;
    	this.game = game;

    }

    public void actionPerformed(ActionEvent e)
    {
    	
    	//get text from menuItem
        String text = ((JMenuItem)(e.getSource())).getText();

        switch (text)
        {
            case "Neues Spiel":
            	               
            	NewGameWindow newGameWindow = new NewGameWindow(window);
            	         
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
