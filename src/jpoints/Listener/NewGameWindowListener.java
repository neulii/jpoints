package jpoints.Listener;

import jpoints.Game;
import jpoints.NewGameWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Listener for NewGameWindow
 * @author neulii
 *
 */

public class NewGameWindowListener implements ActionListener {
	
	NewGameWindow newGameWindow;
	Game newGame;
	

	public NewGameWindowListener(NewGameWindow newGameWindow, Game newGame)
	{
		this.newGameWindow = newGameWindow;
		this.newGame = newGame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText = ((JButton)(e.getSource())).getText();

		//TODO check inputs and implememt listener
		switch(buttonText)
		{
		case "OK":

			//check inputs

			String pTwoName = newGameWindow.getPlayerInputPanelOne().getInputName();
			String pOneName = newGameWindow.getPlayerInputPanelTwo().getInputName();


			if( (pOneName.length()==0) || (pTwoName.length() ==0))
			{
				JOptionPane.showMessageDialog(null, "bitte eingaben überprüfen");
				return;
			}

			//JOptionPane.showMessageDialog(null, "OK");
			
			break;
			
		case "Abbrechen":
			
			JOptionPane.showMessageDialog(null, "abbrechen");
			
			
			
			break;
			
		}

	}

}
