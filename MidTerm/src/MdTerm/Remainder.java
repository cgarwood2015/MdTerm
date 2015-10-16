package MdTerm;

/**
 * Class			Remainder
 * Methods:  		Takes two integer divide one by the other and return the remainder
 * 					Output either No Remainder of the Remainder value
 * 
 * Exceptions:		NONE
 * 					  
 * 
 */
public class Remainder {

	public static void main(String[] args) {  //Main
		int iValue=0,lValue=0,remainder=0;
		String sRemainder = "";
		
		while(iValue  != -1){
			System.out.printf("Please enter integer 1(-1 to exit):");
			if((iValue = ScannerUtility.getArithmeticInput()) == -1){  //Input and test sentinel value
				continue;
			}
			
			System.out.printf("Please enter integer 2(-1 to exit):");
			if((lValue = ScannerUtility.getArithmeticInput()) == -1){  //Input and test sentinel value
				iValue = -1;
				continue;
			}
			
			remainder = iValue % lValue;
			sRemainder = (remainder <= 0)? "No Remainder" : "Remainder is: "+remainder;
			
			System.out.printf("%s%n%n",sRemainder);
		}
	}  //End Main
}
