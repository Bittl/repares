package repares;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * Created by ПКПК on 13.06.2017.
 */
public class ReparesTableModel extends DefaultTableModel {



    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

//    @Override
//    public void addTableModelListener(TableModelListener l) {
//        super.addTableModelListener(l);
//
//    }
}
