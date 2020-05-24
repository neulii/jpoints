import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowMenuListener implements ActionListener {


    public void actionPerformed(ActionEvent e)
    {
        String text = ((JMenuItem)(e.getSource())).getText();



        switch (text)
        {
            case "Neues Spiel":
            //TODO new game listener
                JOptionPane.showMessageDialog(null,"neu");
                break;


            case "Beenden":
            //TODO beenden listener

                JOptionPane.showMessageDialog(null,"end");

                break;

            case "Info":
            //TODO info listener
                JOptionPane.showMessageDialog(null,"info");

                break;


        }








    }
}
