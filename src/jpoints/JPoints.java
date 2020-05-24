package jpoints;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JPoints {

    private static MainWindow mainWindow;

    static public void main(String args[])
    {
    	
    	//set look and feel 
    	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
    	
    	
        mainWindow = new MainWindow(700,300);
        mainWindow.show();
    }

}