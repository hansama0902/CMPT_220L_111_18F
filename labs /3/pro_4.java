package pro_4;

public class pro_4 {
	
	public static void main(String[] args) {


	int n;

	for(n=14999;n>0;n--)

	{ int c=0;

	for(int i=1;i<=n;i++)

	{

	if(n%i==0)

	{

	c++;

	}

	}

	if(c==2)

	break;

	}

	System.out.println("Largest n which is prime as well as less than 15000 is "+n);

	}

	}




