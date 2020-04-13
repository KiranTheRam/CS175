import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        String message = "Hello";
        System.out.println("Original message: "+message);

//I was unsure if you wanted me to change the value of message, or to make it into a new string. In each question (where required) I opted to change the value of the string
        message= message.replace("H", "h");

        System.out.println("New message: "+ message);
        System.out.println("New message length: "+ message.length());
    }
}
