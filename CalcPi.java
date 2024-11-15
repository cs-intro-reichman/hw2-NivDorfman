// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
int tp = Integer.parseInt(args[0]);
		double temp = 1;
		int sw =0;
		double c = 3.0;
		for (int i = 0; i < tp-1; i++) {

			if(sw == 0)
			{
				temp -= (1.0/(double)(c));
				sw = 1;
				c += 2.0;
			}
			else if(sw == 1) {temp +=(1.0/(double)(c)); sw = 0; c +=2.0;}
			System.out.println("temp " + temp);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*temp);	}
}
