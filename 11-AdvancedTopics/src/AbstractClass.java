public class AbstractClass {
    public static void main(String[] args) {
        Figure figureRectangule = new Rectangle();
        figureRectangule.draw();

        Figure figureCircle = new Circle();
        figureCircle.draw();
    }
}

//* Abstract class

abstract class Figure{
    public abstract void draw();
}

class Rectangle extends Figure{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Figure{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
