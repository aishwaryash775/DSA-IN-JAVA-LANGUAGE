public class bitwiseop {
    public static void main(String[] args) {
        int a =4;
        int b = 5;
        System.out.println("a & b = " +(a & b));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("a | b = " +(a | b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " +(a ^ b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println("~a = " +(~a));
        System.out.println(Integer.toBinaryString(~a));
    }
}
