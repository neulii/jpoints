import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    JFrame mainWindow;

    //menus
    JMenuBar menuBar;
    JMenu gameMenu;

    MainWindowMenuListener menuActionListener;

    public MainWindow(int width, int height){

        mainWindow = new JFrame("JPoints");
        mainWindow.setSize(700,500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Spiel");
        JMenu infoMenu = new JMenu("Info");

        menuBar.add(gameMenu);
        menuBar.add(infoMenu);

        JMenuItem newGame= new JMenuItem("Neues Spiel");
        JMenuItem exit = new JMenuItem("Beenden");

        JMenuItem info = new JMenuItem("Info");


        gameMenu.add(newGame);
        gameMenu.add(exit);


        infoMenu.add(info);

        menuActionListener = new MainWindowMenuListener(mainWindow);

        newGame.addActionListener(menuActionListener);
        exit.addActionListener(menuActionListener);
        info.addActionListener(menuActionListener);



        mainWindow.setJMenuBar(menuBar);

    }


    public void show(){
        mainWindow.setVisible(true);

    }

}
