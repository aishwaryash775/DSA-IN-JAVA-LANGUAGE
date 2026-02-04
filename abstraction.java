public class abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sayhello();
        d.saybye();
        d.sleep();
    }
}

abstract class Animal {
    public abstract void Sayhello();
    public abstract void saybye();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    public void Sayhello() {
        System.out.println("Dog says Hello");
    }

    public void saybye() {
        System.out.println("Dog says Bye");
    }
}
