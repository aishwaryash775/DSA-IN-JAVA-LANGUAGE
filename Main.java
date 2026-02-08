
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your Rollno is: " + rollno);
      input.close();
    } 
}



// public class ArrayExample {
//     public static void main(String[] args) {
//         // Declaration and initialization
//         int[] numbers = new int[5];

//         // Insertion
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;

//         // Traversal
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println("Element at index " + i + ": " + numbers[i]);
//         }
//     }
// }
