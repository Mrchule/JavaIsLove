
//Write a java program to create an abstract class named Shape that contains two integers and an
//        empty method named printArea(). Provide three classes named Rectangle, Triangle and
//        Circle such that each one of the classes extends the class Shape. Each one of the
//        classes contain only the method printArea( ) that prints the area of the given shape.

package Java.Practice;

public abstract class Shapes {
    double d1;
    double d2;
    public Shapes(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    public abstract void PrintArea();
}
class Rectangle extends Shapes{
    public Rectangle(double x, double y){
        super(x,y);
    }
    @Override
    public void PrintArea() {
        System.out.println("Area of Rectangle="+ d1*d2);
    }
}
class Circle extends Shapes{
    public Circle(double x , double y){
        super(x,y);
    }

    public void PrintArea(){
        double area=2*3.14*d1;
        System.out.println("the area of the circle is ="+area);
    }

}
class Triangle extends Shapes{
    public Triangle(double height , double base){
        super(height,base);
    }

    public void PrintArea(){
        double are=0.5*d1*d2;
        System.out.println("the area of the triangle is ="+are);
    }

}