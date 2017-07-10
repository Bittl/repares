package repares;

import DBConnect.DBConnect;

/**
 * Created by ПКПК on 13.06.2017.
 */
public class ReparesConstants {

    private String reparesNamesColumns[] = {"ID", "Вн. Номер", "Дата прихода", "Ответственый", "менеджер", "клиент", "контакт клиента", "Номер телефона", "Прибор", "Завод", "Сер. Номер",
            "Рем. Орг.", " Дата деф.", "работы", "Цена вх.", "Цена рек.", "Цена кл.", "Дата платежа", "Дата конца емонта", "дата отправки", "Дополнительно",
            "Гарантийный номер", "Запчасти", "Заметки"};

    static{
        DBConnect.connect("UniTecBase.db");
    }

    public String[][] getRepares(String s){
//        String[][] repares = DBConnect.read(s);
        return DBConnect.read(s);
    }

    public String[] getReparesNamesColumns(){
        return reparesNamesColumns;
    }

    public void addNewNote(String query){
        DBConnect.write(query);
    }

    public String[] getTableNames(String s){

        return DBConnect.getNames(s);
    }
}
