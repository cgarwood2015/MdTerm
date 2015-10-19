package MdTerm;

public class PythagoreanTriples {

	public static void main(String[] args) {
		
		int sentinel = 0;
		int side1=0,side2=0,hypotenuse=0;
		
		
		while(sentinel != -1){
			System.out.printf("Enter side 1 of triangle (-1 to exit):");
			side1 = ScannerUtility.getArithmeticInput(); //Side one of triangle
			
			if(side1 == -1){
				sentinel = -1;
				continue;
			}
			
			System.out.printf("Enter side 2 of triangle:");
			side2 = ScannerUtility.getArithmeticInput(); //Side two of triangle
			
			System.out.printf("Enter hypotenuse:");
			hypotenuse = ScannerUtility.getArithmeticInput(); //Side two of triangle
			
			System.out.printf("Is triangle a pythagorean triple? %s",pyTriple(side1,side2,hypotenuse));
			System.out.print("\n\n");
		}
		
	}
	
	public static String pyTriple(int side1,int side2, int hypotenuse){
		if ((side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse)){
			return "p";
		}else{
			return "n";
		}
	}
}
