public abstract class Shape {
    private String color;
    private double area;
    Shape(String color){
        this.color = color;
    }
    public String showInfo(){
        return "颜色:" + color + " 面积:" + area;
    }

    abstract double getArea();

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setR(1);
        System.out.println("c1的面积："+c1.getArea());

        Rectangle r1 = new Rectangle();
        r1.setWidthLength(2,4);
        System.out.println("r1的面积："+r1.getArea());
    }
}
class Circle extends Shape{
    private double r;
    Circle()
    {
        super("白色");
    }
    Circle(String color,double r)
    {
        super(color);
        this.r = r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public String showInfo()
    {
        return "class Circle showInfo override";
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    Rectangle()
    {
        super("红色");
    }
    Rectangle(String color,double width,double length)
    {
        super(color);
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    public void setWidthLength(double width,double length) {
        this.width = width;
        this.length = length;
    }
    public String showInfo()
    {
        return "class Rectangle showInfo override";
    }
}
