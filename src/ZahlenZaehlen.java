import java.util.Scanner;

public class ZahlenZaehlen {

    //Beispieleingabe: 3 1 2 3 2 3 2 3 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int count = 0;
        while(sc.hasNextInt()) {
            int i = sc.nextInt();
            if(first == i){
                ++count;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
