package MdTerm;

import java.security.SecureRandom;

public class RandomNumber {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
            System.out.printf("%s%n",RanNumber.getRandomNumber().getID());
        }

		
		//int[] array = {404,405,406,406,411};
		//System.out.println(array[randomNumbers.nextInt(array.length)]); 

	}

	private enum RanNumber{
		NumOne(404),NumTwo(405),NumThree(406),NumFour(407),NumFive(411);		
		private int id;
		
		RanNumber(int id){
			this.id = id;
		}
		
		public int getID(){
			return id;
		}
		
		public static RanNumber getRandomNumber(){
			SecureRandom randomNumbers = new SecureRandom();
			return values()[randomNumbers.nextInt(values().length)];
			
			
		}
	}
	
}
