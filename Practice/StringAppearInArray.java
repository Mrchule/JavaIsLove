package Java.Practice;

public class StringAppearInArray {
    public static void main(String[] args) {
        String[] str={"hello","world","johns","johns","rohan"};
        String target="johns";
        int c=0;
//        System.out.println(target.compareTo(str[2]));

        for (String s : str) {

            if (target.compareTo(s) == 0) {
                c = c + 1;
            }

        }
        System.out.println("the no of johns are :"+c);
        }
    }

