import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = (int)(67.23f);
        System.out.println("The value of num is: " + num);

        scanner.close();
    }
}
