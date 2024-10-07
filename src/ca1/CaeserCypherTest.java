package ca1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CaeserCypherTest {

    @Test
    public void testEncode() {
    	CaeserCypher cypher = new CaeserCypher();
        assertArrayEquals(new char[]{'b', 'c', 'd'}, cypher.encode(new char[]{'a', 'b', 'c'}, 1));
        assertArrayEquals(new char[]{'c', 'd', 'e'}, cypher.encode(new char[]{'a', 'b', 'c'}, 2));
    }

    @Test
    public void testDecode() {
    	CaeserCypher cypher = new CaeserCypher();
        assertArrayEquals(new char[]{'a', 'b', 'c'}, cypher.decode(new char[]{'b', 'c', 'd'}, 1));
        assertArrayEquals(new char[]{'a', 'b', 'c'}, cypher.decode(new char[]{'c', 'd', 'e'}, 2));
    }
}