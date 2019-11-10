import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int k = s.nextInt(); // Key
        k = k % 26;
        String b = s.next().toUpperCase();
        s.close();

        String ergebnis = "";

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int character = c + k;
            if (character > 'Z') {
                character -= 26;
            }
            ergebnis += String.valueOf((char) character);
        }
        System.out.println(ergebnis);

    }
}
