package jpoints.Listener;

import jpoints.Game;
import jpoints.NewGameWindow;
import jpoints.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * Listener for NewGameWindow
 * @author neulii
 *
 */

public class NewGameWindowListener implements ActionListener {
	
	NewGameWindow newGameWindow;
	Game newGame;
	int pointDiff;

	public NewGameWindowListener(NewGameWindow newGameWindow, Game newGame)
	{
		this.newGameWindow = newGameWindow;
		this.newGame = newGame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton button = ((JButton)(e.getSource()));

		String buttonText = button.getText();
		
		switch(buttonText)
		{
		case "OK":

			//check inputs

			String pOneName = newGameWindow.getPlayerInputPanelOne().getInputName();
			String pTwoName = newGameWindow.getPlayerInputPanelTwo().getInputName();
			String diffPoints =newGameWindow.getDiffPointTextField().getText();
		
			//check first name
			if(pOneName.length()==0)
			{
				JOptionPane.showMessageDialog(null, "bitte eingaben Ueberpruefen");

				JTextField textField = newGameWindow.getPlayerInputPanelOne().getInputTextField();
				textField.requestFocus();
				textField.selectAll();
				
				return;
			}
			//check second name
			else if (pTwoName.length() ==0)
			{
				JOptionPane.showMessageDialog(null, "bitte eingaben ueberpruefen");

				JTextField textField = newGameWindow.getPlayerInputPanelTwo().getInputTextField();
				textField.requestFocus();
				textField.selectAll();

				return;
			}
			
			//check pointdiff input
			
			else if(diffPoints.length() == 0 || !neulib.Utils.isNumeric(diffPoints))
			{
				JOptionPane.showMessageDialog(null, "bitte eingaben ueberpruefen");

				JTextField textField = newGameWindow.getDiffPointTextField();
				textField.requestFocus();
				textField.selectAll();

				return;
			}
			
			//inputs are valid -> create player and games

			Player pOne = new Player(pOneName);
			Player pTwo = new Player(pTwoName);

			newGame = new Game(pointDiff);
			newGame.addPlayer(pOne);
			newGame.addPlayer(pTwo);
		
			//JOptionPane.showMessageDialog(null, "OK");
			
			break;
			
		case "Abbrechen":
			
			JOptionPane.showMessageDialog(null, "abbrechen");
			
			break;
		}
	}
}