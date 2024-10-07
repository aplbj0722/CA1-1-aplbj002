package ca1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CaesarCypherTest {

    @Test
    public void testEncode() {
        CaesarCypher cypher = new CaesarCypher();
        assertArrayEquals(new char[]{'b', 'c', 'd'}, cypher.encode(new char[]{'a', 'b', 'c'}, 1));
        assertArrayEquals(new char[]{'c', 'd', 'e'}, cypher.encode(new char[]{'a', 'b', 'c'}, 2));
    }

    @Test
    public void testDecode() {
        CaesarCypher cypher = new CaesarCypher();
        assertArrayEquals(new char[]{'a', 'b', 'c'}, cypher.decode(new char[]{'b', 'c', 'd'}, 1));
        assertArrayEquals(new char[]{'a', 'b', 'c'}, cypher.decode(new char[]{'c', 'd', 'e'}, 2));
    }
}