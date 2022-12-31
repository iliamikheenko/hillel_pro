package hillel_pro.lesson04.phonebook;

class Record {
    private final String name;
    private final String phone;

    Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "name: " + name +
                ", phone: " + phone;

    }
}

