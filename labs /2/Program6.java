package Program3;
import java.util.Random;
public class Program6 {

	    public static void main(String[] args) {
	        Random random = new Random();
	        int n1 = random.nextInt(8) + 2;
	        int n2 = random.nextInt(10);
	        int n3 = random.nextInt(10);
	        int n4 = random.nextInt(10);
	        int n5 = random.nextInt(10);
	        int n6 = random.nextInt(10);
	        int n7 = random.nextInt(10);
	        int n8 = random.nextInt(10);
	        int n9 = random.nextInt(10);
	        int n10 = random.nextInt(10);
	        String  Program6 = String.format("(%d%d%d) %d%d%d-%d%d%d%d", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
	        System.out.println(Program6);
	    }

	}

