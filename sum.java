import java.util.Scanner;


public class sum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     float num1 = in.nextFloat();

        float num2 = in.nextFloat();
    float sum = num1 + num2;
System.out.println("sum is" + sum);
in.close();
    }
}

