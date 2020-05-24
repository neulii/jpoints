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
                JOptionPane.showMessageDialog(null,"neu");
                break;

            case "Beenden":
                JOptionPane.showMessageDialog(null,"end");

                break;

            case "Info":
                JOptionPane.showMessageDialog(null,"info");

                break;


        }








    }
}
