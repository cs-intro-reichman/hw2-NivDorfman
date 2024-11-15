// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
	    String mode = args[1];
		int temp = 1;
		int runs = 1;
		if(mode.equals("v"))
		{
			if(temp != 0)
				{
					temp *=3;
					temp +=1;
				}
				else temp /=2;
				System.out.print(1 +" "+temp);
				runs ++;


			for (int i = 2; i < seed+2; i++) {
				
				while(temp != 1)
					{
						if(temp % 2 == 1)
						{
							temp *=3;
							temp +=1;
						}
						else temp /=2;
						runs ++;
						System.out.print(" "+temp);
					}				
					System.out.println(" (" + runs  + ")");			
					temp = i; runs = 1 ;
					if(temp <= seed)
					{
					System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");
					System.out.print(temp);

					}
			}
		}
		else if(mode.equals("c")){
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");

		}	}
}
