package MdTerm;

public class SumEvenIntegers {

	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i = 4;i <= 54;i+=2){
			//just to ensure, this is so not neccessary but Im making sure
			if(i % 2== 0){
				result = result + i;
			}
		}
		System.out.printf("The total of integer between 4 and 54 is:%d",result);
		
	}

}
