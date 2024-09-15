package UnitTesting;

/**
 * This class implements the Comparable interface.
 * The compareTo method of the Student class is used to compare two Student objects.
 * The compareTo method compares the grade and name of two Student objects.
 */
public class Student implements Comparable<Student> {
    /**
     * The name is initialized to null.
     */
    String name;

    /**
     * The grade is initialized to '\0'.
     */
    char grade;

    /**
     * Default constructor of Student.
     */
    public Student() {
    }

    /**
     * Parameterized constructor of Student.
     * @param n The name of the Student.
     * @param g The grade of the Student.
     */
    public Student(String n, char g) {
        name = n;
        grade = g;
    }

    /**
     * The compareTo method of the Student class. This method compares the grade and name of two Student objects.
     * @param other The other Student object to compare with.
     * @return The difference in the grade and name of the two Student objects.
     */
    public int compareTo(Student other) {
        if (grade == other.grade) {
            if (name.charAt(0) == other.name.charAt(0)) {
                return 0;
            } else {
                return name.charAt(0) - other.name.charAt(0);
            }
        } else {
            return other.grade - grade;
        }
    }
}