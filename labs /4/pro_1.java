package pro_1;
import java.text.DecimalFormat;
public class pro_1 {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("000.00"); 
	System.out.print("\nin cm | cm in");
	System.out.print("\n-------------------------------");
	for(int i=1,j=1;i<=50;){
	System.out.printf("\n%2d ",i);
	System.out.print(df.format(i*2.54));
	System.out.printf(" |%3d ",j);
	System.out.print(df.format(j*0.393701));
	i=i+1; 
	j=j+5; 
	}
	}
	
}
