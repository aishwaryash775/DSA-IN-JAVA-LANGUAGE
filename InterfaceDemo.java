interface Animal{
    int eyes=2;
    void walk();


    interface Herbivore{

    }

    
}

class  Horse implements Animal,Animal.Herbivore {
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        System.out.println("Number of eyes: " + Horse.eyes);
    }
}