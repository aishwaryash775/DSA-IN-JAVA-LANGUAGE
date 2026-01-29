import  java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary for increament bonus:");

        int salary =sc.nextInt();
        if(salary<50000){
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
         System.out.println("Your new salary is: "+salary);
    }
}