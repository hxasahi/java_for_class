public class Circle extends Shape implements Movable{
    double radius;
    @Override
    double getArea() {
        area=2*Math.PI*radius;
        return area;
    }

    @Override
    double getPer() {
        per=Math.PI*radius;
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("圆形长："+radius);
        System.out.println("圆形颜色："+getColor());
        System.out.println("圆形面积："+getArea());
        System.out.println("圆形周长："+getPer());
        System.out.println();
    }
    @Override
    public void move()
    {
        System.out.println("移动圆形");
        System.out.println();
    }

    Circle()
    {
        radius=1;
        color="red";
    }
    Circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
}
