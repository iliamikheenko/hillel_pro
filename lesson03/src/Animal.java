public abstract class Animal {
    private String name;
    private static int amountOfAnimals;

    public Animal(String name) {
        this.name = name;
        amountOfAnimals++;
    }

    public static int getAmountOfUnits() {
        return amountOfAnimals;
    }

    String getName() {
        return name;
    }

    public void run(int dist) {
    }

    public void swim(int dist) {
    }
}