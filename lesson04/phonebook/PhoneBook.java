package hillel_pro.lesson04.phonebook;

import java.util.ArrayList;
public class PhoneBook {
    private ArrayList<Record> phoneBook = new ArrayList<>();
    public void add(String name, String number){
        if (name != null && number != null){
        phoneBook.add(new Record(name,number));
        }else{
            System.out.println("IllegalArguments");
        }
    }
    public Record find(String name){
        for (Record record : phoneBook) {
            if (name.equalsIgnoreCase(record.getName())) {
                return record;
            }
        }
        return null;
    }
    public void findAll(String name){
        ArrayList<String> allNumbers = new ArrayList<>();
        for (Record record : phoneBook) {
            if (name.equalsIgnoreCase(record.getName())) {
                allNumbers.add(record.getPhone());
            }
        }
        System.out.println("name: " + name +
                           ", phones: " + allNumbers.toString());
    }

}
