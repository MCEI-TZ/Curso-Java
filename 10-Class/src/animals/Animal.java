package animals;
//* Herency
//*Father class
public class Animal {
    protected void eat(){
        System.out.println("Eating...");
    }

    protected void sleep(){
        System.out.println("Sleeping...");
    }

    public void makeNosie(){
        System.out.println("Beast noise");
    }
}

class Cat extends Animal{
    //* Overriding father method to make polymorphism
    @Override
    public void makeNosie(){
        System.out.println("Miau Miau");
    }
}

//* Child class
class Perro extends Animal {

    @Override
    public void makeNosie(){
        System.out.println("Woof Woof");
    }

    @Override
    protected void eat(){
        System.out.println("Dog eating");
    }

    @Override
    protected void sleep(){
        System.out.println("Dog sleeping");

        //* super father
        super.sleep();
    }

}

class Prueba {
    //* Method of Polymorphism
    static  void printNoise (Animal animal){
        animal.makeNosie();
    }

    public static void main(String[] args) {
        System.out.println("-------Example of Herency-------");
        //* Father class
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        //* Father Polymorfism
        var animal2 = new Animal();
        printNoise(animal2);

        //* Children class Application of Polymorfism
        var dog1 = new Perro();
        printNoise(dog1);

        var cat1 = new Cat();
        printNoise(cat1);

    }
}
