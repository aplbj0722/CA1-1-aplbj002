package ca4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testEqualsAndHashCode() {
        Car car1 = new Car("Make1", "Model1", "Color1");
        Car car2 = new Car("Make2", "Model1", "Color1");
        assertEquals(car1, car2);
        assertEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    public void testToString() {
        Car car = new Car("Make1", "Model1", "Color1");
        assertEquals("Make1, Model1, Color1", car.toString());
    }
}
