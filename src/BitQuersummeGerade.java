public class BitQuersummeGerade {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int quersumme = 0;
        for(int i=0; i<32; i+=2) {
            quersumme += (x>>i&0b1);
        }
        System.out.println(quersumme);
    }
}
