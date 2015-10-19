package MdTerm;

public class Palindrome {

	public static void main(String[] args) {
		char c[] = {'a','b','c','b','a'};
		char c2[] = {'a','b','c','d','e'};
		
		System.out.print("The following characters is a Palidrome <- ");
		System.out.print(c);				
		System.out.printf(" :%s",isPalindrome(c));
		
		
		System.out.print("\nThe following characters is a Palidrome <- ");
		System.out.print(c2);				
		System.out.printf(" :%s",isPalindrome(c2));
		

	}
	
	public static boolean isPalindrome(char[] ch){
		
		int chr1 = 0;  //  First character
		int chr2 = ch.length - 1; //last of array at last character.
		
		while(chr2 > chr1){   
			if(ch[chr1] != ch[chr2]){
				return false;
			}
			++chr1;  //converge the beginning and end of array
			--chr2;
		}
		return true;
	}
	

}
