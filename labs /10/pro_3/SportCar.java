package Lab10;

class SportCar implements Printable
{
private String name;
private long number;

public SportCar(String name,long number)
{
  this.name = name;
  this.number = number;
}

public void print()
{
  System.out.println("Sports Car : Name : "+name +" Number : "+number);
}
}

