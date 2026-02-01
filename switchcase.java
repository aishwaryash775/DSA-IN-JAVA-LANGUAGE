import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Apple":
                System.out.println("Apple is red");
                break;
            case "Mango":
                System.out.println("Mango is yellow");
                break;
            case "Orange":
                System.out.println("Orange is orange");
                break;
            case "Grapes":
                System.out.println("Grapes are purple");
                break;
            case "Banana":
                System.out.println("Banana is yellow");
                break;
            default:
                System.out.println("Please enter a valid fruit");

        }
    }
}
