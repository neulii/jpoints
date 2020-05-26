package jpoints;

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
	
	private JDialog newGameWindow;
	

	public NewGameWindowListener(JDialog newGameWindow)
	{
		this.newGameWindow = newGameWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText = ((JButton)(e.getSource())).getText();
		
		switch(buttonText)
		{
		case "OK":
			
			JOptionPane.showMessageDialog(newGameWindow, "OK");
			
			break;
			
		case "Abbrechen":
			
			JOptionPane.showMessageDialog(newGameWindow, "abbrechen");
			
			break;
			
		}

	}

}
