import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //take input from user until user enters X or x
      int answer = 0;
            while (true){
                //take the operator as input.
                System.out.print("Enter operator ");
                char op = in.next().trim().charAt(0);  

                if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                  System.out.print("Enter two numbers");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    
                    if(op == '+'){
                        answer = num1 + num2;
                    }
                    if(op == '-'){
                        answer = num1 - num2;
                    }
                    if(op == '*'){
                        answer = num1 * num2;
                    }
                    if(op == '/'){
                        if(num2 !=0){
                            answer = num1 / num2;

                        }
                    }
                    if(op == '%'){
                        answer = num1 % num2;
                    }else if(op == 'X' || op == 'x'){
                        break;
                    }else{
                        System.out.println("Invalid operator!");            


                }
                System.out.println(answer);
            }
            in.close();
        }
}
}
