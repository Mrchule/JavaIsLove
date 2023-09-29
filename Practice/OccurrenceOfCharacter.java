package Java.Practice;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String str="OccurrenceOfTheCharacter";
    int c=0;
    str=str.toLowerCase();
    char ch='c';
        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)){
                c++;
            }

        }
        System.out.println(c);

    }

}
