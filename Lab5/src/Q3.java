import java.awt.*;

public class Q3 {
    public static void main(String[] args) {

        Rectangle square1 = new Rectangle(0, 0, 40, 40);
        Rectangle square2 = square1;

        System.out.println("Width of square1 is: " +square1.width);
        System.out.println("Width of square2 is: " +square2.width);
        square1.translate(15,25);
        System.out.println("Top left corner of square1 is at: "+square1.x + ", "+square1.y);
        System.out.println("Top left corner of square2 is at: "+square2.x + ", "+square2.y);

    }
}
