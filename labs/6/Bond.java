package Bond;

public class Bond { // class bond
  
private double coupon; // The global variables required to calculate the cost of bond
private int payments;
private double interest;
private double valueMaturity;
private double price;
  
public Bond() { // default constructor, setting all the global variables to zero
coupon=0;
payments=0;
interest=0;
valueMaturity=0;
}

public Bond(double coupon, int payments, double interest, double valueMaturity) {
this.coupon = coupon;
this.payments = payments;
this.interest = interest;
this.valueMaturity = valueMaturity;
}
  
public double getPrice() // get price() that will return the price of the bond
{
double temp=1; // creating the temp variable to calculate (1+i)^n
  
while(payments>0) // loop the number of times we are having payments
{
temp= (temp*(1+interest)); // calculate temp as temp*(i+i)
payments--; // decrement payment by 1
}
// calculate price by using the formula in the question
price=(coupon * (1-(1/temp))) + (valueMaturity*(1/temp));
  
return price; //return price to the calling function.
}
  
  
  
}
