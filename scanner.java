import java.util.Scanner;

public class scanner {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
             double val = Math.PI;
             System.out.println("the value of pi is:" + val);
                  //the value of pi is:3.141592653589793
             System.out.printf("the value of pi is:" + "%.2f", val);
             //the value of pi is:3.14
             sc.close();
        }    
}
