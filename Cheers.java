// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
		 String str = args[0].toUpperCase();
                int temp =Integer.parseInt(args[1]);

                for(int i = 0; i < str.length(); i++)
                {
                        char ch = str.charAt(i);
                        if(ch == 'A' || ch == 'E' || ch == 'F' || ch == 'H' ||ch == 'I'|| ch == 'L' || ch == 'M'
                        || ch == 'N' || ch == 'O' || ch == 'R')
                        {
                                System.out.println("Give me an " + str.charAt(i) + ": " + str.charAt(i) + "!");

                        }
                        else  System.out.println("Give me a  " + str.charAt(i) + ": " + str.charAt(i) + "!");

                }
                System.out.println("What does that spell?");
                for (int i = 0; i < temp; i++) {
                        System.out.println(str + "!!!");
                    
                }        }
}
