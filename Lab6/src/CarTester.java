public class CarTester {
    public static void main(String[] args) {
        Car myCar = new Car(20);
        myCar.addGas(50);
        myCar.drive(100);
        System.out.println("Gas left in tank: "+myCar.getGasInTank()+ " gallons");
    }
}
