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
}

//* Child class
class Perro extends Animal {
    public void makeNosie(){
        System.out.println("Gua Gua gua");
    }

    @Override
    protected void eat(){
        System.out.println("Dog eating");
    }

    @Override
    protected void sleep(){
        System.out.println("Dog sleeping");
    }

    public static void main(String[] args) {
        System.out.println("-------Example of Herency-------");
        //* Father class
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        //* Child class

        var perro1 = new Perro();
        perro1.eat();
        perro1.sleep();
        perro1.makeNosie();

    }
}

