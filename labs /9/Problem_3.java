package Lab9;

import java.io.*;

import java.util.Scanner;

public class Problem_3{

public static void main(String[] args) {

if(args.length!=2){

System.out.println("Usage: java Problem_3 <string> <file>");

System.exit(0);

}

try{

Scanner fin = new Scanner(new File(args[1]));

String lines = "";

while(fin.hasNextLine()){

String line = fin.nextLine();

line = line.replaceAll(args[0], "");

lines += line+"\n";

}

fin.close();

PrintWriter pw = new PrintWriter(new File(args[1]));

pw.println(lines);

pw.close();

}catch(FileNotFoundException e){

System.out.println("Unable to open file");

}

}

}