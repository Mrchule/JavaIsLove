package Java.Practice;

class Examination implements Student ,Department{
    @Override
    public void show() {
        System.out.println("this is a department interface method");
    }

    @Override
    public void Display() {
        System.out.println("this is a student interface method");
    }
}
public class Exam {
    public static void main(String[] args) {
        Examination e=new Examination();
        e.show();
        e.Display();
    }
}
