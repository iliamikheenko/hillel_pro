package hillel_pro.lesson04.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final ArrayList<Record> phoneBook = new ArrayList<>();
    public void add(String name, String number){
        if (name != null && number != null){
        phoneBook.add(new Record(name,number));
        }else{
            System.out.println("IllegalArguments");
        }
    }
    public Record find(String name){
        for (Record record : phoneBook) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }
    public List<Record> findAll(String name){
        List<Record> records = new ArrayList<>();
        for (Record record : phoneBook) {
            if (name.equalsIgnoreCase(record.getName())) {
                records.add(record);
            }
        }
        return records;
    }
}
