package Lab10;

public class Toaster extends Appliance {
	   // Extend the Appliance class
	   private String brand;
	   private String model;
	   private boolean isAutomatic;
	   // Two different constructors
	   public Toaster(String brand, String model, boolean isAutomatic, double voltage, String colour, String madeIn,
	           double price) {
	       super(voltage, colour, madeIn, price);
	       this.brand = brand;
	       this.model = model;
	       this.isAutomatic = isAutomatic;
	   }

	   public Toaster() {
	       super(0, "None", "None", 0);
	   }
	   // Getter and setter methods
	   public String getBrand() {
	       return brand;
	   }

	   public void setBrand(String brand) {
	       this.brand = brand;
	   }

	   public String getModel() {
	       return model;
	   }

	   public void setModel(String model) {
	       this.model = model;
	   }

	   public boolean isAutomatic() {
	       return isAutomatic;
	   }

	   public void setAutomatic(boolean isAutomatic) {
	       this.isAutomatic = isAutomatic;
	   }

	   @Override
	   public String toString() {
	       return "Toaster [brand=" + brand + ", model=" + model + ", isAutomatic=" + isAutomatic + ", getPrice()="
	               + getPrice() + "]";
	   }
	  
} 
	