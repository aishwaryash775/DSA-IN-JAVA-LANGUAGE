//question sum all digits of a number
//hint: use while loop and modulus operator
//we can extract each digit by taking modulus with 10 and then dividing the number by 10 to remove the last digit and repeat the process until the number becomes 0 and keep adding the extracted digits to a sum variable
//time complexity: O(log n) where n is the input number
//space complexity: O(1)
//author:AIshwarya shinde

import java.util.*;

public class digitsum {
    public static long sum_digits(long num){
        long sum = 0;
          while (num!=0){
       long rem = num%10;
        sum += rem;
        num /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long ans = sum_digits(num);
        System.out.println(ans);

        sc.close();

    }
}
