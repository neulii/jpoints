package jpoints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Listener for NewGameWindow
 * @author neulii
 *
 */

public class NewGameWindowListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText = ((JButton)(e.getSource())).getText();
		
		switch(buttonText)
		{
		case "OK":
			
			break;
			
		case "Abbrechen":
			
			break;
			
		}

	}

}
