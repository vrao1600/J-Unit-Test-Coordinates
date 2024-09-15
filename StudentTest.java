package UnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Student class.
 */
public class StudentTest {

    /**
     * Test default constructor of Student.
     * Ensures that name and grade are initialized to null and '\0' respectively.
     */
    @Test
    public void testDefaultConstructor() {
        Student student = new Student();
        assertEquals(null, student.name);
        assertEquals('\0', student.grade);
    }

    /**
     * Test parameterized constructor of Student.
     * Ensures that name and grade are initialized to given values.
     */
    @Test
    public void testParameterizedConstructor() {
        Student student = new Student("Alice", 'A');
        assertEquals("Alice", student.name);
        assertEquals('A', student.grade);
    }

    /**
     * Test compareTo method of Student.
     * Compares two Student objects with different grades.
     */
    @Test
    public void testCompareToDifferentGrades() {
        Student student1 = new Student("Alice", 'A');
        Student student2 = new Student("Bob", 'B');
        assertEquals(1, student1.compareTo(student2));
    }

    /**
     * Test compareTo method of Student.
     * Compares two Student objects with the same grade but different names.
     */
    @Test
    public void testCompareToSameGradeDifferentNames() {
        Student student1 = new Student("Alice", 'A');
        Student student2 = new Student("Bob", 'A');
        assertEquals(-1, student1.compareTo(student2));
    }

    /**
     * Test compareTo method of Student.
     * Compares two identical Student objects.
     */
    @Test
    public void testCompareToSameStudent() {
        Student student1 = new Student("Alice", 'A');
        Student student2 = new Student("Alice", 'A');
        assertEquals(0, student1.compareTo(student2));
    }
}
