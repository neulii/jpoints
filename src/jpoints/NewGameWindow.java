package jpoints;

import jpoints.Listener.NewGameWindowListener;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class NewGameWindow {

	private PlayerInputPanel playerOne;
	private PlayerInputPanel playerTwo;
	
	private JLabel createGameLabel;
	
	private JDialog window;
	private JButton okButton;
	private JButton cancelButton;
	
	private Game newGame;
	private JTextField pointDiffInput;
	
	public NewGameWindow(JFrame parentWindow) {
		
		window = new JDialog(parentWindow, "Neues Spiel erstellen", JDialog.ModalityType.DOCUMENT_MODAL);
		window.setBounds(100, 100, 453, 370);
		window.getContentPane().setLayout(null);
		
		window.setLocationRelativeTo(parentWindow);
		
		window.setResizable(false);
		window.setModalExclusionType(null);
		
		
		createGameLabel = new JLabel("Spieler erstellen:");
		createGameLabel.setBounds(30, 20, 216, 16);
		
		window.getContentPane().add(createGameLabel);
		
		playerOne = new PlayerInputPanel(150,250,50,"spieler 1:",30);
		playerOne.setLocation(30,50);
		playerOne.setLabelBackground(Color.yellow);
		
		playerTwo = new PlayerInputPanel(150,250,50,"spieler 2:",30);
		playerTwo.setLocation(30, 130);
		playerTwo.setLabelBackground(Color.green);
		
		
		window.getContentPane().add(playerOne);
		window.getContentPane().add(playerTwo);
		
		okButton = new JButton("OK");
		okButton.setBounds(78, 260, 138, 52);
		window.getContentPane().add(okButton);
		okButton.addActionListener(new NewGameWindowListener(this,newGame));
		
		cancelButton = new JButton("Abbrechen");
		cancelButton.setBounds(230, 260, 138, 52);
		window.getContentPane().add(cancelButton);
		
		JLabel pointDiffLabel = new JLabel("Punkteunterschied zum Sieg:");
		pointDiffLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pointDiffLabel.setBounds(30, 199, 186, 37);
		window.getContentPane().add(pointDiffLabel);
		
		pointDiffInput = new JTextField();
		pointDiffInput.setHorizontalAlignment(SwingConstants.CENTER);
		pointDiffInput.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pointDiffInput.setBounds(230, 191, 138, 38);
		window.getContentPane().add(pointDiffInput);
		pointDiffInput.setColumns(10);
		cancelButton.addActionListener(new NewGameWindowListener(this,newGame));
		
	}
	
	//TODO game must be return here
	public Game showModal()
	{
		window.setVisible(true);
		
		return null;
	}

	public PlayerInputPanel getPlayerInputPanelOne()
	{
		return playerOne;
	}

	public PlayerInputPanel getPlayerInputPanelTwo()
	{
		return playerTwo;
	}
}
