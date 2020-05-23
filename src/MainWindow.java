import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    JFrame mainWindow;
    JMenuBar menuBar;

    public MainWindow(int width, int height){

    mainWindow = new JFrame("JPoints");
    mainWindow.setSize(700,500);
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    menuBar = new JMenuBar();

    JMenu file = new JMenu("menu");

    menuBar.add(file);

    JMenuItem exit = new JMenuItem("Beenden");
    JMenuItem newGame= new JMenuItem("neues Spiel");

    file.add(exit);
    file.add(newGame);



    newGame.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null,"hallo das ist ein test");

        }
    });


    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);

        }
    });
    mainWindow.setJMenuBar(menuBar);

    }


    public void show(){
        mainWindow.setVisible(true);

    }

}
