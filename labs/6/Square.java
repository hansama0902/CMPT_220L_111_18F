package pro_2;

public class Square {

	   private double width;

	  

	   public Square() {

	       width = 1;

	   }

	  

	   public Square(double width) {

	       this.width = width;

	   }

	   /**

	   * @return the width

	   */

	   public double getWidth() {

	       return width;

	   }

	   /**

	   * @param width the width to set

	   */

	   public void setWidth(double width) {

	       this.width = width;

	   }

	   @Override

	   public String toString() {

	       return "Square with side = " + width;

	   }

	  

	   public double getPerimeter() {

	       return 4 * width;

	   }

	  

	   public double getArea() {

	       return width * width;

	   }

	  

	   public static void main(String args[]) {

	       Square s1 = new Square(40);

	       Square s2 = new Square(35.9);

	       System.out.println("Width of square 1 : " + s1.getWidth());

	       System.out.println("Area of square 1 : " + s1.getArea());

	       System.out.println("Perimeter of square 1 : " + s1.getPerimeter());

	      

	       System.out.println();

	      

	       System.out.println("Width of square 2 : " + s2.getWidth());

	       System.out.println("Area of square 2 : " + s2.getArea());

	       System.out.println("Perimeter of square 2 : " + s2.getPerimeter());

	   }

	}

