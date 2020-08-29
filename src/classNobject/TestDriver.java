package classNobject;

public class TestDriver {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("Car should have start features");
            }

            @Override
            public void stop() {
                System.out.println("Car should have break features");
            }
        };
        car.start();
        car.stop();

        Engine engine = (i1,i2)-> System.out.println(i1+ i2);
        engine.fly(10,20);


        Vehicle lambdaVehicle = () -> System.out.println("Car should have start features");
        lambdaVehicle.move();

        RideSharing rideSharing = s->System.out.println(s);
        rideSharing.rideOnDemand("Need a ride");


    }

}