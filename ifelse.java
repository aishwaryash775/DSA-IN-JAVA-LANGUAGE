import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
        if ( salary < 10000){
            System.out.println("I am student");

        }else if (salary <200000){
            System.out.println("I am job holder");
    }else if (salary <500000){
            System.out.println("I am businessman");
}else if (salary <1000000){
            System.out.println("I am developer");
}else{
            System.out.println("I am something else");
        }
        sc.close();
    }
}



