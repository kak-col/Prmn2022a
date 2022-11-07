package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation sta = new GasStation();
        car.run();
        sta.refuel(car);
        car.run();
    }
}
