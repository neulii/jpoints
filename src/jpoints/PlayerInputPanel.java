package jpoints;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerInputPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PlayerInputPanel() {
		setLayout(new GridLayout(0, 2, 0, 0));
		
		this.setSize(300, 50);
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
