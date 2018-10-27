package Lab7;



public class Circle{

public double radius;

public double x,y;

Circle(){

x=y=0;

radius=1;

}

public Circle(double x,double y,double radius) {

this.radius = radius;

this.x =x;

this.y =y;

}

public boolean contains(double x,double y){

double distanceOfPoints = Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));

if(distanceOfPoints<=radius){

return true;

}else{

return false;

}

}

public boolean contains(Circle c){

//check if center of the circle is inside the circle

return contains(c.x,c.y);

}

public boolean overlaps(Circle c){

double distanceOfCenter = Math.sqrt(Math.pow(this.x-c.x, 2) + Math.pow(this.y-c.y, 2));

double totalRadiusLength = radius+c.radius;

if(distanceOfCenter<totalRadiusLength && distanceOfCenter>radius && distanceOfCenter>c.radius){

return true;

}else{

return false;

}

}

public double calculateArea(){

return 3.14*radius*radius;

}

public double calculatePerimeter(){

return 2*3.14*radius;

}

public void printDetails(){

System.out.println("--------------------------------------------");

System.out.println("radius of Circle is : "+radius);

System.out.println("Area of Circle is : "+calculateArea());

System.out.println("Perimeter of Circle is : "+calculatePerimeter());

}

public static void main(String[] args) {

Circle c1 = new Circle(2,2,5.5);

c1.printDetails();

System.out.println("c1.contains(3,3) : "+c1.contains(3,3));

System.out.println("c1.contains(new Circle(4,5,10.5)) : "+c1.contains(new Circle(4,5,10.5)));

System.out.println("c1.overlaps(new Circle(3,5,2.3)) : "+c1.overlaps(new Circle(3,5,2.3)));

}

}
