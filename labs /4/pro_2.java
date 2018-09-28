package pro_1;
import java.util.Random;
public class pro_2 { public static void main(String[] args) {
	char matrix[][] = new char[5][5]; 
	//creation of char array of size 5*5
	Random random = new Random(); 
	//creation of object random
	//loops 5*5 times
	for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
	char c = (char)(random.nextInt(26)+'a');
	//generates random lowercase character
	matrix[i][j] = c;
	//stores the char in matrix
	System.out.print(matrix[i][j]+" "); 
	//prints the element to console
	}
	System.out.print("\n"); 
	//prints new line
	}
	  
	}
	}


