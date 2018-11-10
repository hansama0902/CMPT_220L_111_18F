package Lab9;

class GeometricObject {

private String color = "White";

private boolean filled;

private java.util.Date dateCreated;

public GeometricObject() {

dateCreated = new java.util.Date();

}

public GeometricObject(String color, boolean filled) {

dateCreated = new java.util.Date();

this.color = color;

this.filled = filled;

}

public java.util.Date getDatecreated() {

return dateCreated;

}

public boolean isFilled() {

return filled;

}

public String getColor() {

return color;

}

public void setColor(String color) {

this.color = color;

}

public void setFilled(boolean filled) {

this.filled = filled;

}

public String toString() {

return "created on" + dateCreated + "\ncolor: " + color+ " and filled: " + filled;

}

}