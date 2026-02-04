
class Student {
    String string = "This is a polymorphism example.";
    int number = 42;
public void printInfo(String name) {
    System.out.println("This is a polymorphism example.");
    System.out.println(name);
}
public void printInfo(int number) {
    System.out.println("This is a polymorphism example.");
    System.out.println(number);
}
public void printInfo(String name, int number) {
  
    System.out.println(name + " " + number);
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Alice");
        s1.printInfo(42);
        s1.printInfo("Bob", 27);
s1.printInfo(s1.string,s1.number);
    }

}
}   