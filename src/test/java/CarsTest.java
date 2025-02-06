import org.example.Car;
import org.example.ElectricCar;
import org.example.Nowa2;
import org.example.SportsCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarsTest {

    private List<Car> cars;

    @BeforeEach
    public void setUp() {
        cars = List.of (new Car("Tesla", "X", "V6E4R7", 2024, true),
                new SportsCar("BMW", "A4", "SZY6738", 2012, false, 350),
                new ElectricCar("Honda", "Y", "HU8394", 2015, true, 0.7),
                new ElectricCar("Tesla", "Y", "Y6G5R7", 2020, true, 0.3),
                new Car("Ford", "Tremor", "FH5384", 2020, true),
                new SportsCar("Audi", "Q5", "GE4729", 2019, true, 300));
    }
    @Test
    public void testFindWithSpeedAtLeast() {
        Car find = Nowa2.findWithSpeedAtLeast(cars, 300);

        assertEquals("BMW", find.brand);
    }
    @Test
    public void testFindUncharged() {
        Car find = Nowa2.findUncharged(cars, 0.6);

        assertEquals("Tesla", find.brand);
    }
}
