package ca3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArrayCountTest {

    @Test
    void testCount() {
        ArrayCount arrayCount = new ArrayCount();
        assertEquals(0, arrayCount.count(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(1, arrayCount.count(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(3, arrayCount.count(new int[]{1, 2, 2, 4, 2}, 2));
    }
}