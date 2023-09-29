package Java.Practice;

public class PalindromString {
    public static void main(String[] args) {

        String original = "Dot saw I was Tod";
        String reversed = "";

        for (int i = 0; i < original.length(); i++) {
            reversed = original.charAt(i) + reversed;
        }
        System.out.println(reversed);
        if (original.equals(reversed)) {
            System.out.println(" true ");
        } else {
            System.out.println(false);
        }
    }
}


