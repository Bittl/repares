package repares;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by ПКПК on 13.06.2017.
 */
public class RepareAdd extends JDialog {

    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    String[] lables;
    ArrayList<String> fields = new ArrayList<>();
    private boolean isWork = true;
    private String[] newData = null;
    ReparesConstants reparesConstants = new ReparesConstants();

    public RepareAdd(JFrame owner){

        super(owner, "Новый ремонт", true);


        setSize(500, 550);
        JPanel dataPanel = new JPanel();
        JScrollPane dataScroll = new JScrollPane();
        JPanel buttonPanel = new JPanel();
        add(dataPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

//        dataScroll.add(dataPanel);
//        dataScroll.add(buttonPanel);
//        add(dataScroll, BorderLayout.CENTER);
        dataPanel.setLayout(new GridLayout(24, 2));


        JButton buttonAdd = new JButton("Добавить");
        JButton buttonCancel = new JButton("Отмена");
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonCancel);


        JLabel nZayav = new JLabel("Номер заявки");
        JTextField nTZayav = new JTextField("none");
        dataPanel.add(nZayav);
        dataPanel.add(nTZayav);

        JLabel manager = new JLabel("Ответственный");
        JTextField tManager = new JTextField("none");
        dataPanel.add(manager);
        dataPanel.add(tManager);

        JLabel manager2 = new JLabel("Менеджер");
        JTextField tManager2 = new JTextField("none");
        dataPanel.add(manager2);
        dataPanel.add(tManager2);

        JLabel client = new JLabel("Клиент");
        JTextField tClient = new JTextField("none");
        dataPanel.add(client);
        dataPanel.add(tClient);

        JLabel contact = new JLabel("Контакт клиента");
        JTextField tContact = new JTextField("none");
        dataPanel.add(contact);
        dataPanel.add(tContact);

        JLabel clientPhone = new JLabel("Телефон клиента");
        JTextField tClientPhone = new JTextField("none");
        dataPanel.add(clientPhone);
        dataPanel.add(tClientPhone);

        dataPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
        dataPanel.add(new JSeparator(SwingConstants.HORIZONTAL));

        JLabel device = new JLabel("Прибор");
        JTextField tDevice = new JTextField("none");
        dataPanel.add(device);
        dataPanel.add(tDevice);

        JLabel factory = new JLabel("Производитель");
        JTextField tFactory = new JTextField("none");
        dataPanel.add(factory);
        dataPanel.add(tFactory);

        JLabel serial = new JLabel("Серийный номер");
        JTextField tSerial = new JTextField("none");
        dataPanel.add(serial);
        dataPanel.add(tSerial);

        JLabel repOrg = new JLabel("Ремонтирующая организация");
        JTextField tRepOrg = new JTextField("none");
        dataPanel.add(repOrg);
        dataPanel.add(tRepOrg);

        JLabel dateDef = new JLabel("Дата отправки в дефектацию");
        JTextField tDateDef = new JTextField("none");
        dataPanel.add(dateDef);
        dataPanel.add(tDateDef);

        JLabel works = new JLabel("Перечень работ");
        JTextField tWorks = new JTextField("none");
        dataPanel.add(works);
        dataPanel.add(tWorks);

        JLabel priceIn = new JLabel("Стоимость нам");
        JTextField tPriseIn = new JTextField("none");
        dataPanel.add(priceIn);
        dataPanel.add(tPriseIn);

        JLabel priceOut = new JLabel("Стоимость Клиенту");
        JTextField tPriceOut = new JTextField("none");
        dataPanel.add(priceOut);
        dataPanel.add(tPriceOut);

        JLabel dateMoney = new JLabel("Дата оплаты");
        JTextField tDateMoney = new JTextField("none");
        dataPanel.add(dateMoney);
        dataPanel.add(tDateMoney);

        JLabel dateEndRep = new JLabel("Дата получения из ремонта");
        JTextField tDateEndRep = new JTextField("none");
        dataPanel.add(dateEndRep);
        dataPanel.add(tDateEndRep);

        JLabel dateDeliver = new JLabel("Дата отправки");
        JTextField tDateDeliver = new JTextField("none");
        dataPanel.add(dateDeliver);
        dataPanel.add(tDateDeliver);

        JLabel addition = new JLabel("Дополнительно");
        JTextField tAddition = new JTextField("none");
        dataPanel.add(addition);
        dataPanel.add(tAddition);

        JLabel guarantie = new JLabel("№ гарантии");
        JTextField tGuarantie = new JTextField("none");
        dataPanel.add(guarantie);
        dataPanel.add(tGuarantie);

        JLabel supplies = new JLabel("Используемые ЗЧ");
        JTextField tSupplies = new JTextField("none");
        dataPanel.add(supplies);
        dataPanel.add(tSupplies);

        JLabel notes = new JLabel("Примечаине");
        JTextField tNotes = new JTextField("none");
        dataPanel.add(notes);
        dataPanel.add(tNotes);

        dataPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
        dataPanel.add(new JSeparator(SwingConstants.HORIZONTAL));

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pushCancel();
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Calendar today = Calendar.getInstance();
                String tToday = today.get(today.DAY_OF_MONTH) + "-" + (today.get(today.MONTH) + 1) + "-" + today.get(today.YEAR);



                fields.add(nTZayav.getText());
                fields.add(tToday);
                fields.add(tManager.getText());
                fields.add(tManager2.getText());
                fields.add(tClient.getText());
                fields.add(tContact.getText());
                fields.add(tClientPhone.getText());
                fields.add(tDevice.getText());
                fields.add(tFactory.getText());
                fields.add(tSerial.getText());
                fields.add(tRepOrg.getText());
                fields.add(tDateDef.getText());
                fields.add(tWorks.getText());
                fields.add(tPriseIn.getText());
                fields.add(tPriceOut.getText());
                fields.add(tPriceOut.getText());
                fields.add(tDateMoney.getText());
                fields.add(tDateEndRep.getText());
                fields.add(tDateDeliver.getText());
                fields.add(tAddition.getText());
                fields.add(tGuarantie.getText());
                fields.add(tSupplies.getText());
                fields.add(tNotes.getText());

                String[] s = new String[fields.size()];


                for (int i = 0; i < fields.size(); i++) {
                    s[i] = fields.get(i);
                }
                newData = s;
                addNote(s);
//                ReparesTable.addNote(s);
//                TableFrame.setNewData(s);
//                addNote(s);
//                ReparesModel.addInVector(s);
                isWork = false;
                dispose();



            }
        });








        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);


    }

    public String[] getData (){
        return newData;
    }
    public boolean isWorking(){
        return isWork;
    }

    protected void addNote(String[] insertData) {        //добавляем запись в таблицу SQL
        String query = "insert into repares (";
        String[] collNames = reparesConstants.getTableNames("repares");
        for (int i = 1; i < collNames.length; i++) {
            if (i == collNames.length - 1) query += collNames[i] + ") ";
            else query += collNames[i] + ", ";

        }

        query += "values (";

        for (int i = 0; i < insertData.length; i++) {
            if (i == insertData.length - 1) query += "'" + insertData[i] + "')";
            else query += "'" + insertData[i] + "', ";
        }

        query += ";";
        System.out.println(query);
        reparesConstants.addNewNote(query);
//        TableFrame.setNewTableModelRepare();
    }

    private void pushCancel(){
        this.setVisible(false);
//        System.exit(0);
        dispose();
    }
}

