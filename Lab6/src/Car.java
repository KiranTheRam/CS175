public class Car {
    private double fuelEff;
    private double fuel;

    public Car(double fuelEff) {
        this.fuelEff = fuelEff; // In miles/gal
        fuel=0;
    }

    public void drive(double distance) {
        fuel -= (distance / fuelEff);
    }

    public double getGasInTank() {
        return fuel;
    }
    public void addGas(double amount) {
        fuel+=amount;
    }
}
