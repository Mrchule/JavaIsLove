package Java.Practice;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10.5,20.49);
        r.PrintArea();
        Circle c=new Circle(10,0);
        c.PrintArea();
        Triangle t=new Triangle(10 ,20);
        t.PrintArea();
    }
}
