package Lab10;

interface Printable
{
public void print();

}
class Rectangle implements Printable
{
private int length,width;

public Rectangle(int length,int width)
{
  this.length = length;
  this.width = width;
}
public void print()
{
  System.out.println("Rectangle : length : "+length+" width : "+width +" Area : "+length*width);
}
}
