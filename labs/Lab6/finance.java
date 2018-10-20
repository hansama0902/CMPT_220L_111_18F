package Bond;


public class finance {


public static void main(String[] args) {
Bond b = new Bond(500,100,5,10000); // create a object of Bond with name b and pass the parameters as specified to the constructor

// call the getPrice() and print the price.
System.out.println("The price of the bond is: " + b.getPrice());
}
  
}