package Lab7;


public class TestClass {

public static void main(String[] args) {

MyLong ml1=new MyLong(123456789L);

if(ml1.isEven())

{

System.out.println(ml1.getValue()+" is Even.");

}

if(ml1.isOdd())

{

System.out.println(ml1.getValue()+" is Odd.");

}

if(ml1.isPrime())

{

System.out.println(ml1.getValue()+" is Prime.");

}

  

long val=987654322L;

if(MyLong.isEven(val))

{

System.out.println(val+" is Even.");

}

if(MyLong.isOdd(val))

{

System.out.println(val+" is Odd.");

}

if(MyLong.isPrime(val))

{

System.out.println(val+" is Prime.");

}

  

MyLong ml2=new MyLong(981276345L);

if(MyLong.isEven(ml2))

{

System.out.println(ml2.getValue()+" is Even.");

}

if(MyLong.isOdd(ml2))

{

System.out.println(ml2.getValue()+" is Odd.");

}

if(MyLong.isPrime(ml2))

{

System.out.println(ml2.getValue()+" is Prime.");

}

char ch[]={'1','2','3','4','5','6','7','8','9','1','2','3'};

long l1=MyLong.parseLong(ch);

System.out.println(l1);

String str="23456789876565";

long l2=MyLong.parseLong(str);

System.out.println(l2);

}

}

