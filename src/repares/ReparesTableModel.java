package repares;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * Created by ПКПК on 13.06.2017.
 */
public class ReparesTableModel extends DefaultTableModel {

    private ReparesConstants repData = new ReparesConstants();
    private static int columnCount;

    public ReparesTableModel(){

        setColumnIdentifiers(repData.getReparesNamesColumns());
        columnCount = repData.getRepares("repares").length;
        for (int i = 0; i < columnCount; i++) {
            addRow(repData.getRepares("repares")[i]);

        }

    }



    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }



}
