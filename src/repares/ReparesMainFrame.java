package repares;

import javax.swing.*;

/**
 * Created by ПКПК on 06.07.2017.
 */
public class ReparesMainFrame extends JInternalFrame {

    public ReparesMainFrame(String name, boolean iconifiable, boolean resizable, boolean maximixeable, boolean closeable){
        setSize(1300, 600);
        setClosable(closeable);
        setIconifiable(iconifiable);
        setResizable(resizable);
        setMaximizable(maximixeable);
        setName(name);
        setTitle(name);






        setVisible(true);
    }

}
