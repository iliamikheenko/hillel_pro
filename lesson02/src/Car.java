public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Electricity is on");
    }
    private void startCommand(){
        System.out.println("Command started");
    }
    private void startFuelSystem(){
        System.out.println("FuelSystem is launched");
    }
}