
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