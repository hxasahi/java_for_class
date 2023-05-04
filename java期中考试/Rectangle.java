public class Rectangle extends Shape implements Movable{
    double Width;
    double height;

    @Override
    double getArea() {
        area=Width*height;
        return area;
    }

    @Override
    double getPer() {
        per=2*Width+2*height;
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("矩形长："+Width);
        System.out.println("矩形宽："+height);
        System.out.println("矩形颜色："+getColor());
        System.out.println("矩形面积："+getArea());
        System.out.println("矩形周长："+getPer());
        System.out.println();
    }
    @Override
    public void move()
    {
        System.out.println("移动矩形");
        System.out.println();
    }
    Rectangle()
    {
        Width=1;
        height=2;
        color="green";
    }
    Rectangle(double Width,double height,String color)
    {
        this.Width=Width;
        this.height=height;
        this.color=color;
    }
}
