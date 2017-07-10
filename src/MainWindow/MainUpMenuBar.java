package MainWindow;

import repares.ReparesMainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ПКПК on 04.07.2017.
 */
public class MainUpMenuBar extends JMenuBar {

    public MainUpMenuBar(){
        add(createOpenMenu());
    }


    private JMenu createOpenMenu(){
        JMenu openJmenu = new JMenu("Таблицы");

        JMenuItem reparesTable = new JMenuItem("Ремонты");
        reparesTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReparesMainFrame("Ремонты", true, true, true, true);
            }
        });

        openJmenu.add(reparesTable);

        return openJmenu;
    }



}
