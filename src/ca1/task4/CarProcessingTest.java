package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarProcessingTest {
    @Test
    public void testRemoveDuplicates() {
        Car car1 = new Car("Make1", "Model1", "Color1");
        Car car2 = new Car("Make2", "Model1", "Color1");
        Car car3 = new Car("Make3", "Model2", "Color2");
        Car[] cars = new Car[]{car1, car2, car3};

        CarProcessing processing = new CarProcessing();
        Car[] result = processing.removeDuplicates(cars);

        assertEquals(2, result.length);
        assertEquals(car1, result[0]);
        assertEquals(car3, result[1]);
    }
}