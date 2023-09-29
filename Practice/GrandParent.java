package Java.Practice;

public class GrandParent {
    public GrandParent(int a){
        System.out.println("GrantParent Constructor "+a);

    }
}
 class Parent extends GrandParent {
    public Parent(int a, int b) {
        super(a);
        System.out.println("Parent constructor "+a+" "+b);

    }
}
class Child extends Parent{
    public Child(int a, int b, int c){
        super(a,b);
        System.out.println("The child constructor called "+a+" "+b + " "+c);
    }
}