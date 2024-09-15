package UnitTesting;

/**
 * This class implements the Comparable interface.
 * The compareTo method of the CoOrds class is used to compare two CoOrds objects.
 * The compareTo method compares the x and y coordinates of two CoOrds objects.
 */
public class CoOrds implements Comparable<CoOrds> {
    /**
     * The x and y coordinates of the CoOrds object.
     */
    int x, y;

    /**
     * The default constructor of the CoOrds class. This constructor initializes the x and y coordinates to 0.
     */
    public CoOrds() { // default constructor
        x = y = 0;
    }

    /**
     * The parameterized constructor of the CoOrds class. This constructor initializes the x and y coordinates to the given values.
     * @param X The x coordinate of the CoOrds object.
     * @param Y The y coordinate of the CoOrds object.
     */
    public CoOrds(int X, int Y) {
        x = X;
        y = Y;
    }

    /**
     * The compareTo method of the CoOrds class. This method compares the x and y coordinates of two CoOrds objects.
     * @param other The other CoOrds object to compare with.
     * @return The difference in the x and y coordinates of the two CoOrds objects.
     */
    public int compareTo(CoOrds other) {
        if (x != other.x) {
            return x - other.x;
        } else {
            return y - other.y;
        }
    }
}