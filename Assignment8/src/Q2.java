import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(10, 20, 40, 40);
        square.translate(20,20);
        System.out.println("Width is: " + square.width+ "\nHeight is: "+ square.height);
    }
}
