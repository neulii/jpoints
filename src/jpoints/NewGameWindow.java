package jpoints;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

public class NewGameWindow {

	private PlayerInputPanel playerOne;
	private PlayerInputPanel playerTwo;
	
	private JDialog window;
	
	public NewGameWindow(JFrame parentWindow) {
		
		window = new JDialog(parentWindow, "Neues Spiel erstellen", JDialog.ModalityType.DOCUMENT_MODAL);
		window.setBounds(100, 100, 450, 300);
		window.getContentPane().setLayout(null);
		
		window.setLocationRelativeTo(parentWindow);
		
		window.setResizable(false);
		window.setModalExclusionType(null);
		
		
		JLabel creatGameLabel = new JLabel("Spieler erstellen:");
		creatGameLabel.setBounds(30, 20, 216, 16);
		window.getContentPane().add(creatGameLabel);
		
		playerOne = new PlayerInputPanel(150,250,50,"spieler 1:",30);
		playerOne.setLocation(30,50);
		playerOne.setLabelBackground(Color.yellow);
		
		playerTwo = new PlayerInputPanel(150,250,50,"spieler 2:",30);
		playerTwo.setLocation(30, 130);
		playerTwo.setLabelBackground(Color.green);
		
		
		window.getContentPane().add(playerOne);
		window.getContentPane().add(playerTwo);
		
		JButton okButton = new JButton("OK");
		okButton.setBounds(156, 204, 138, 52);
		window.getContentPane().add(okButton);
	}
	
	public void showModal()
	{
		window.setVisible(true);
		
	}
}
