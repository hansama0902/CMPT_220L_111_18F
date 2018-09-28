package pro_1;
import java.util.Scanner;
public class pro_4 {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.print("Enter a text :");

//taking input from the user

String str=sc.nextLine();

String temp="";


for(int i=0;i<str.length();i++){

int count=0;

char c=str.charAt(i);


if(Character.isAlphabetic(c)){

for(int j=0;j<str.length();j++){

if(c==str.charAt(j)) count++;

}


if(!temp.contains(c+"")) System.out.println(c+" - "+count);

temp+=c;

}

}

}

}


