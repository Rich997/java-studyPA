public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Sum " + sum);
		
		int subtraction=first-second;
		System.out.println("Subtraction " + subtraction);
		
		int multi = first*second;
		System.out.println("Multi " + multi);
		
		double division;
		division=first/second;
		System.out.println("Division " + division);
		
		
		
		
	}
	
}
