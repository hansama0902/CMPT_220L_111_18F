package Lab10;

public abstract class Employee {

	   String name;

	   double age;

	   double hourRate;

	  

	  

	  

	   public Employee(String name, double age, double hourRate) {

	       super();

	       this.name = name;

	       this.age = age;

	       this.hourRate = hourRate;

	   }

	   public abstract double salary(double hours);

	   @Override

	   public String toString() {

	       return "name=" + name + ", age=" + age + ", hourRate=" + hourRate;

	   }

	  

	  

	  

	}


