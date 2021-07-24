
public class SwitchCaseExample {

	public static void main(String[] args) {

		//user will pass name of state and we will print its capital
		
		String state="UP";
		
		switch(state) {
		case "MP":
			System.out.println("Capital Of MP is Bhopal");
			break;
		case "MH":
			System.out.println("Capital Of MH is Mumbai");
			break;
		case "RJ":
			System.out.println("Capital of RJ is Jaipur");
			break;
		default:
			System.out.println("Not Available");
		}

	}

}
