package MainWindow;

import repares.ReparesMainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ПКПК on 04.07.2017.
 */
public class MainWindow extends JFrame {

    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();



    public MainWindow (){

        setSize((int)dimension.getWidth() - 35, (int)dimension.getHeight() - 35);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setJMenuBar(new MainUpMenuBar());
        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane);
        desktopPane.add(new ReparesMainFrame("Ремонты", true, true, true, true));



        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}
