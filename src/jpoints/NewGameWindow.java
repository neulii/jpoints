package jpoints;

import jpoints.Listener.NewGameWindowListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class NewGameWindow {

	PlayerInputPanel playerOne;
	PlayerInputPanel playerTwo;
	
	JLabel createGameLabel;
	JLabel pointDiffLabel;
	
	JTextField pointDiffInput;

	JDialog window;
	
	JButton okButton;
	JButton cancelButton;
	
	Game newGame;

	MainWindow mainWindow;
	
	public NewGameWindow(MainWindow parentWindow) {
		
		mainWindow = parentWindow;
		newGame = mainWindow.getGame();
		window = new JDialog(mainWindow.getFrame(), "Neues Spiel erstellen", JDialog.ModalityType.DOCUMENT_MODAL);
		window.setBounds(100, 100, 453, 370);
		window.getContentPane().setLayout(null);
		
		window.setLocationRelativeTo(parentWindow.getFrame());
		
		window.setResizable(false);
		window.setModalExclusionType(null);
		
		
		createGameLabel = new JLabel("Spieler erstellen:");
		createGameLabel.setBounds(30, 20, 216, 16);
		
		window.getContentPane().add(createGameLabel);
		
		//setpanels
		playerOne = new PlayerInputPanel(150,250,50,"spieler 1:",30);
		playerOne.setLocation(30,50);
		playerOne.setLabelBackground(Color.yellow);
		
		playerTwo = new PlayerInputPanel(150,250,50,"spieler 2:",30);
		playerTwo.setLocation(30, 130);
		playerTwo.setLabelBackground(Color.green);
		
		
		window.getContentPane().add(playerOne);
		window.getContentPane().add(playerTwo);
		
		int buttonLineYPos = 260;
		
		//OKbutton
		okButton = new JButton("OK");
		okButton.setBounds(78, buttonLineYPos, 138, 52);
		window.getContentPane().add(okButton);
		okButton.addActionListener(new NewGameWindowListener(this,newGame));
		
		//set default enter button
		JRootPane rootPane = SwingUtilities.getRootPane(okButton);
		rootPane.setDefaultButton(okButton);

		//cancelbutton
		cancelButton = new JButton("Abbrechen");
		cancelButton.setBounds(230, buttonLineYPos, 140, 52);
		window.getContentPane().add(cancelButton);
		
		pointDiffLabel = new JLabel("Punkteunterschied zum Sieg:");
		pointDiffLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pointDiffLabel.setBounds(30, 200, 250, 37);
		window.add(pointDiffLabel);
		
		pointDiffInput = new JTextField();
		pointDiffInput.setHorizontalAlignment(SwingConstants.CENTER);
		pointDiffInput.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pointDiffInput.setBounds(280, 191, 150, 38);
		
		window.add(pointDiffInput);
		pointDiffInput.setColumns(10);
		cancelButton.addActionListener(new NewGameWindowListener(this,newGame));
		
	}
	
	
	public Game showModal()
	{
		window.setVisible(true);
		
		return newGame;
	}

	public PlayerInputPanel getPlayerInputPanelOne()
	{
		return playerOne;
	}

	public PlayerInputPanel getPlayerInputPanelTwo()
	{
		return playerTwo;
	}

	public JTextField getDiffPointTextField()
	{
		return pointDiffInput;
	}

	public void dispose() {
		window.dispose();
		
	}
	
	public MainWindow getMainWindow()
	{
		return mainWindow;
	}
}
