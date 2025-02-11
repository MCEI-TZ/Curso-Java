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

    public static void main(String[] args) {
        System.out.println("-------Example of Herency-------");
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();
    }
}
