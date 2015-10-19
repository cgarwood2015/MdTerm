package MdTerm;

public class PrimeNumber {
	public static void main(String[] args){
		int m = 59;
		int maxPrimes = 59;
		
		while(m <= maxPrimes && m > 0){
			if(isPrime(m)){
				System.out.println("Prime Number:"+m);
			}
			m = m - 1;
		}
	}
	
	public static boolean isPrime(int number){
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
	}
	
	
}
