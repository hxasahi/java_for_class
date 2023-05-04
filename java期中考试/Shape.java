public abstract class Shape {
    double area;
    double per;
    String color;
    Shape()
    {
        color="white";
    }
    Shape(String color)
    {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPer();

    abstract void showAll();

    public String getColor() {
        return color;
    }
}
