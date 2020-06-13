package jpoints;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PlayerInputPanel extends JPanel {
	
	
	private static final long serialVersionUID = 7824360932468944010L;
	
	private JTextField inputName;
	private JLabel playerNameLabel;

	public PlayerInputPanel(int width_label, int width_InputField, int height, String labelText, float textSize) {
	
		setLayout(null);
		
		this.setSize(width_label + width_InputField , height);
		
		//this.setBackground(Color.red);
		
		playerNameLabel = new JLabel(labelText);
		
		playerNameLabel.setLocation(0, 0);
		playerNameLabel.setOpaque(true);
		//playerNameLabel.setBackground(Color.blue);
		playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		playerNameLabel.setSize(width_label,height);
	
		playerNameLabel.setFont(playerNameLabel.getFont().deriveFont(textSize));
		add(playerNameLabel);
		
		inputName = new JTextField();
		inputName.setLocation(width_label, 0);
		inputName.setSize(width_InputField,height);
		inputName.setHorizontalAlignment(SwingConstants.CENTER);
		inputName.setFont(playerNameLabel.getFont().deriveFont(textSize));
		add(inputName);
	}

	/**
	 *
	 * @return the input from the textfield
	 */
	public String getInputName()
	{
		return inputName.getText();
	}

	public void setLabelBackground(Color color)
	{
		playerNameLabel.setBackground(color);
	}

	public JTextField getInputTextField()
	{
		return inputName;
	}
}
