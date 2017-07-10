package Tests;

import DBConnect.DBConnect;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 * Created by ПКПК on 10.07.2017.
 */
public class TestTableModel extends DefaultTableModel{


    public TestTableModel(){
        DBConnect.connect("test.db");

    }
}
