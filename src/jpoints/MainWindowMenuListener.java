package jpoints;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowMenuListener implements ActionListener {

    JFrame window;

    public MainWindowMenuListener(JFrame window) {
    this.window = window;

    }

    public void actionPerformed(ActionEvent e)
    {
    	
    	//get text from menuItem
        String text = ((JMenuItem)(e.getSource())).getText();



        switch (text)
        {
            case "Neues Spiel":
            	//TODO new game listener
                //JOptionPane.showMessageDialog(null,"neu");
                
            	new NewGameWindow().show();;
            	
            	
            	break;


            case "Beenden":


               window.dispose();

                break;

            case "Info":
            //TODO info listener
                JOptionPane.showMessageDialog(null,"info");

                break;


        }








    }
}
