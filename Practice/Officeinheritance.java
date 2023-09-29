package Java.Practice;

  class Office{
    int empno;
    String empname;
    int salary;
    public Office(int empno, String empname,int salary){
        this.empname=empname;
        this.empno=empno;
        this.salary=salary;
    }

    public void getvalue(){
        System.out.println("employee name is :"+empname);
        System.out.println("Employee no "+empno);
        System.out.println("employee salary :"+salary);
    }
 }
 class Nonteaching extends Office {
      String designation;
      public Nonteaching(int empno, String empname,int salary,String designation){
          super(empno,empname, salary);
          this.designation=designation;
      }
    public void Setvalue(){
        System.out.println("designation is :" +designation);
    }
 }
class Teaching extends Office{
    String designation;
    public Teaching(int empno, String empname,int salary,String designation){
        super(empno,empname, salary);
        this.designation=designation;
    }
    public void Setvalue(){
        System.out.println("Designation :"+designation);

    }
}
public class Officeinheritance {
    public static void main(String[] args) {
    Teaching t=new Teaching(1,"rajat",120000,"IIT");
    Nonteaching t1=new Nonteaching(2, "dev",10000,"nit");
    t.getvalue();
    t.Setvalue();
    t1.getvalue();
    t1.Setvalue();
    }
}
