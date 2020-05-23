import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    JFrame mainWindow;

    //menus
    JMenuBar menuBar;
    JMenu gameMenu;

    public MainWindow(int width, int height){

        mainWindow = new JFrame("JPoints");
        mainWindow.setSize(700,500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Spiel");
        menuBar.add(gameMenu);

        JMenuItem newGame= new JMenuItem("Neues Spiel");
        JMenuItem exit = new JMenuItem("Beenden");

        gameMenu.add(newGame);
        gameMenu.add(exit);



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
