import java.util.Scanner;

public class DatumErweiterung {
        public static int j;
        public static int m;
        public static int t;
        public static int s;
        public static int m1;

        public static void incrM1() {   //Inkrementiert Minute
                m1++;
                if(m1>59){
                        m1=0;
                        incrS();
                }
        }

        public static void incrS() {    //Inkrementiert Stunde
                s++;
                if(s>23){
                        s=0;
                        incrT();
                }
        }

        public static void incrT() {    //Inkrementiert Tage
                t++;
                if ((t>28) & (m==2)) {
                        incrM();
                        t = 1;
                } else {
                        if ((t>30) & ((m==4) | (m==6) | (m==9) | (m==11))) {
                                incrM();
                                t = 1;
                        }
                        if ((t>31) & ((m==1) | (m==3) | (m==5) | (m==7) | (m==8) | (m==10) | (m==12))) {
                                incrM();
                                t = 1;
                        }
                }
        }

        public static void incrM() {    //Inkrementiert Monate und Jahre
                m++;
                if(m>12){
                        m=1;
                        j++;
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                j = sc.nextInt();
                m = sc.nextInt();
                t = sc.nextInt();
                s = sc.nextInt();
                m1 = sc.nextInt();

                int m2 = sc.nextInt();
                while(m2!=0) {          //Jede Minute wird dem Datum addiert
                        incrM1();
                        m2--;
                }
                System.out.println(j + " " + m + " " + t + " " + s + " " + m1);
        }
}
