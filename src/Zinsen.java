public class Zinsen{

	public static void main(String[] args){
		double k0 = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double m = Double.parseDouble(args[3]);
		System.out.println(k0*(1+((p/100)*n)));
		System.out.println(k0*Math.pow(1+(p/100), n));
		System.out.println(k0*Math.pow(1+((p/100)/m),m*n));
	}
}