package jpoints;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NewGameWindow extends JFrame {

	private PlayerInputPanel pip;
	
	
	public NewGameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		pip = new PlayerInputPanel(400,50,"stefan",30);
		
		pip.setLocation(0,0);
		
		this.add(pip);
		
		
		
		
	}

}
