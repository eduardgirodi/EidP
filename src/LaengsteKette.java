import java.util.Scanner;

public class LaengsteKette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longestCount = 1;
        int current = -1;
        int currentCount = 1;
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if(current == i){
                currentCount++;
                if(currentCount > longestCount) {
                    longestCount = currentCount;
                }
            }
            else{
                currentCount = 1;
                current = i;
            }
        }
        System.out.println(longestCount);
    }
}
