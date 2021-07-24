
public class IfElseExample {

	public static void main(String[] args) {
		
		//user will pass the percentage and we need to display the division (60+ I, 45-59 II, 33-44 III, <33 Fail) command line args.
		
		int per=Integer.parseInt(args[0]);
		System.out.println("Percentage : "+per);
		if(per>=60) {
			System.out.println("I-Division");
		}else if(per>=45) {
			System.out.println("II-Division");
		}else if(per>=33) {
			System.out.println("III-Division");
		}else {
			System.out.println("Fail");
		}

	}

}
