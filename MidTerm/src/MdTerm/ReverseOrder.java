package MdTerm;  							   //Assign this class to a package
 
public class ReverseOrder {  				  //Declare the class

	public static void main(String[] args) {  //define the main method
		 int Table [ ];   					  //Declare an array variable of type int and name Table.
		 Table = new int[ 6 ];  			  //Declare the array object and set its lengtj to 6 
		   
		  for ( int i = 0; i < 6; i++ )  	 //for statement for looping through the array
		     Table[ i ] = i * ( i + 1 );     // assign each element of the array with the following formula = counter * (counter + 1)

		  for ( int i = 6; i > 0 ; i-- ) {   //for statement for looping through the array this time descrendingly
		 	System.out.printf( "%d \t ", Table [6-i] );  //Display the value of the array selected value i.e.  counter - 1 in descending order 
		    if ( i%2 != 0 )                              //If the counter is an odd number move to a new line 
		          System.out.print( "\n" );   
		   		
		  }												 //end for loop. 
	}  //end main 													  
}  //end class
