public class Multadd {
	
	public static double multadd(double a, double b, double c){
	return a*b+c;
	}
	public static void main(String[] args) {
		multadd(Math.sin(Math.PI/4.0), 1.0, (Math.cos(Math.PI/4.0))/2.0);
		System.out.print(multadd(Math.sin(Math.PI/4.0), 1.0, (Math.cos(Math.PI/4.0))/2.0));
	}
		
}
