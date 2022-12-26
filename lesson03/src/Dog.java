public class Dog extends Animal{
    private static int amountOfDogs;
    public Dog(String name) {
        super(name);
        amountOfDogs++;
    }
    public static int getAmountOfUnits() {
        return amountOfDogs;
    }
    @Override
    public void run(int dist){
        if (dist < 0){
            System.out.println("Invalid argument.");
        }else if (dist <= 500){
            System.out.printf("%s ran %dm.\n", this.getName(), dist);
        } else {
            System.out.printf("%s can't run more than 500m.\n", this.getName());
        }
    }
    @Override
    public void swim(int dist){
        if (dist < 0){
            System.out.println("Invalid argument.");
        }else if (dist <= 10){
            System.out.printf("%s swam %dм.\n", this.getName(), dist);
        } else {
            System.out.printf("%s can't swim more than 10m.\n", this.getName());
        }
    }
}