package jpoints;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PlayerInputPanel extends JPanel {
	
	private JTextField inputName;
	private JLabel playerNameLabel;

	public PlayerInputPanel(int width, int height, String labelText, float textSize) {
	
		setLayout(null);
		
		this.setSize(width, height);
		
		this.setBackground(Color.red);
		
		playerNameLabel = new JLabel(labelText);
		
		playerNameLabel.setLocation(0, 0);
		playerNameLabel.setOpaque(true);
		playerNameLabel.setBackground(Color.blue);
		playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		playerNameLabel.setSize((int)(width)/3,height);
	
		playerNameLabel.setFont(playerNameLabel.getFont().deriveFont(textSize));
		add(playerNameLabel);
		
		inputName = new JTextField();
		inputName.setLocation(width/3, 0);
		inputName.setSize(width-playerNameLabel.getWidth(),height);
		inputName.setHorizontalAlignment(SwingConstants.CENTER);
		inputName.setFont(playerNameLabel.getFont().deriveFont(textSize));
		add(inputName);
	}
}
