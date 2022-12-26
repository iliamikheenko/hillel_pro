public class Cat extends Animal{
    private static int amountOfCats;
    public Cat(String name) {
        super(name);
        amountOfCats++;
    }
    public static int getAmountOfUnits() {
        return amountOfCats;
    }
    @Override
    public void run(int dist){
        if (dist < 0){
            System.out.println("Invalid argument.");
        }else if (dist <= 200){
            System.out.printf("%s ran %dm.\n", this.getName(), dist);
        } else {
            System.out.printf("%s can't run more than 200m.\n", this.getName());
        }
    }
    @Override
    public void swim(int dist){
        System.out.printf("%s can't swim.\n", this.getName());
    }

}