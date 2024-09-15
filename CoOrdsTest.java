package UnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the CoOrds class.
 * <p>
 * This class contains tests for the CoOrds class, which implements the Comparable interface.
 * The tests ensure that the constructors and the compareTo method of the CoOrds class work as expected.
 * </p>
 */
public class CoOrdsTest {

    /**
     * Tests the default constructor of the CoOrds class.
     * <p>
     * This test creates an instance of CoOrds using the default constructor and checks
     * if the x and y coordinates are initialized to 0.
     * </p>
     */
    @Test
    public void testDefaultConstructor() {
        // Create an instance of CoOrds using the default constructor
        CoOrds coords = new CoOrds();
        
        // Assert that the x coordinate is initialized to 0
        assertEquals(0, coords.x);
        
        // Assert that the y coordinate is initialized to 0
        assertEquals(0, coords.y);
    }

    /**
     * Tests the parameterized constructor of the CoOrds class.
     * <p>
     * This test creates an instance of CoOrds using the parameterized constructor
     * and checks if the x and y coordinates are initialized to the given values.
     * </p>
     */
    @Test
    public void testParameterizedConstructor() {
        // Create an instance of CoOrds using the parameterized constructor
        CoOrds coords = new CoOrds(5, 10);
        
        // Assert that the x coordinate is initialized to the given value
        assertEquals(5, coords.x);
        
        // Assert that the y coordinate is initialized to the given value
        assertEquals(10, coords.y);
    }

    /**
     * Tests the compareTo method of the CoOrds class with different x coordinates.
     * <p>
     * This test creates two instances of CoOrds with different x coordinates
     * and the same y coordinates, and checks the result of the compareTo method.
     * </p>
     */
    @Test
    public void testCompareToDifferentX() {
        // Create two instances of CoOrds with different x coordinates
        CoOrds coords1 = new CoOrds(3, 10);
        CoOrds coords2 = new CoOrds(5, 10);
        
        // Assert that the compareTo method returns the difference in x coordinates
        assertEquals(-2, coords1.compareTo(coords2));
    }

    /**
     * Tests the compareTo method of the CoOrds class with the same x and different y coordinates.
     * <p>
     * This test creates two instances of CoOrds with the same x coordinates
     * and different y coordinates, and checks the result of the compareTo method.
     * </p>
     */
    @Test
    public void testCompareToSameXDifferentY() {
        // Create two instances of CoOrds with the same x and different y coordinates
        CoOrds coords1 = new CoOrds(5, 8);
        CoOrds coords2 = new CoOrds(5, 10);
        
        // Assert that the compareTo method returns the difference in y coordinates
        assertEquals(-2, coords1.compareTo(coords2));
    }

    /**
     * Tests the compareTo method of the CoOrds class with identical coordinates.
     * <p>
     * This test creates two instances of CoOrds with identical x and y coordinates,
     * and checks the result of the compareTo method.
     * </p>
     */
    @Test
    public void testCompareToSameCoords() {
        // Create two instances of CoOrds with identical coordinates
        CoOrds coords1 = new CoOrds(5, 10);
        CoOrds coords2 = new CoOrds(5, 10);
        
        // Assert that the compareTo method returns 0 for identical coordinates
        assertEquals(0, coords1.compareTo(coords2));
    }
}