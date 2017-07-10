package repares;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ПКПК on 13.06.2017.
 */
public class ReparesTable extends JFrame implements TableModelListener {

    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    private JButton buttonAdd = new JButton("Добавить");
    private JButton buttonEdit = new JButton("Изменить");
    private JButton buttonDelete = new JButton("Удалить");
    private RepareAdd repareAdd;
    private DefaultTableModel tableModel = new ReparesTableModel();
//    private static ReparesModel reparesModel;
//    private static String[] newRepareData = null;
    private ReparesConstants repData = new ReparesConstants();
    private static JTable table;
    static JScrollPane scrollPane;
    private static int columnCount;




    public ReparesTable(){

//        tableModel.setColumnIdentifiers(repData.getReparesNamesColumns());
//        columnCount = repData.getRepares("repares").length;
//        for (int i = 0; i < columnCount; i++) {
//            tableModel.addRow(repData.getRepares("repares")[i]);
//
//        }
        tableModel.addTableModelListener(this);




        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonEdit);
        buttonPanel.add(buttonDelete);
        buttonPanel.setSize(this.getWidth(), 50);
        add(buttonPanel, BorderLayout.NORTH);





        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(dimension.width - 35, dimension.height - 35);
        setVisible(true);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repareAdd = new RepareAdd(getThis());

//                tableModel.addRow(newRow(repareAdd.getData()));


            }
        });

        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String[] sss = repData.getRepares("repares")[table.getSelectedRow()];

                for (int i = 0; i < sss.length; i++) {
                    System.out.println(sss[i]);
                }

                tableModel.removeRow(table.getSelectedRow());

            }
        });
    }


//    private JTable bornTable(){
//        reparesModel = null;
//        JTable tempTable = new JTable(reparesModel = new ReparesModel());
//        return tempTable;
//    }

//    private RepareAdd newRepare(){
//        return new RepareAdd(this);
//    }

    private JFrame getThis(){
        return this;
    }

    private String[] newRow(String [] someRow){
        String [] myRow = new String[someRow.length + 1];
        myRow[0] = String.valueOf(Integer.parseInt(repData.getRepares("repares")[repData.getRepares("repares").length-1][0]) + 1);
        for (int i = 1; i < someRow.length; i++) {
            myRow[i] = someRow[i-1];
        }
        myRow[someRow.length] = someRow[someRow.length - 1];
        return myRow;
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReparesTable();

            }
        });
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        ReparesTableModel model = (ReparesTableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        this.repaint();

    }
}
