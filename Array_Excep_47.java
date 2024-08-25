package Assignments;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Array_Excep_47 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        int size = 0;

		        try {
		            System.out.print("Enter the size of the array: ");
		            size = scanner.nextInt();
		        } catch (InputMismatchException e) {
		            System.out.println("Invalid input! Please enter an integer value.");
		            return;  
		        }

		        int[] array = new int[size];

		        try {
		            System.out.println("Enter " + size + " integers:");
		            for (int i = 0; i <= size; i++) { //wrong loop
		                array[i] = scanner.nextInt();
		            }
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index out of bounds! You tried to access an index that doesn't exist.");
		        } catch (InputMismatchException e) {
		            System.out.println("Invalid input! Please enter integer values.");
		        }

		        scanner.close();
	}

}
