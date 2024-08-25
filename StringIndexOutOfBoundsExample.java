package Assignments;
public class StringIndexOutOfBoundsExample {
    public static void main(String[] args) {
        String str = "Hello";

        int index = 10;

        try {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for string length " + str.length());
        }

        System.out.println("Handled the exception and continuing with program");
    }
}



