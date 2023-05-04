public class DEMO {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,2,"red");
        Circle c1 = new Circle(10,"green");
        r1.showAll();
        c1.showAll();
        r1.move();
        c1.move();
    }
}
