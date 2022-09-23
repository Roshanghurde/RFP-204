package Day1problems;

public class Commandline {

	public static void main(String[] args) {

				
		    	int sum=500;
			for (int i=500;i<args.length;i++) {	
			  sum=sum+Integer.parseInt(args[i]);
			}

			System.out.println("sum of natural numbers"+sum);

			}
			}

