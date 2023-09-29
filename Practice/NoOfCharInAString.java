package Java.Practice;

public class NoOfCharInAString {
    public static void main(String[] args) {
        String str="hello";
        char ch='o';
        int c=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                c+=1;
            }
        }
        System.out.println(c);
    }



}
