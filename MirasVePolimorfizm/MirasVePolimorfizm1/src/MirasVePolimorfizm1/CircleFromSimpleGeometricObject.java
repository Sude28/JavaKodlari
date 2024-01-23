package MirasVePolimorfizm1;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{  
  private double radius;

  public CircleFromSimpleGeometricObject() {  
  }
  
  public CircleFromSimpleGeometricObject(double radius) {
	  this.radius=radius;
  }
  
  public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
	  this.radius=radius;
	  setColor(color);
	  setFilled(filled);    
  }
  
  public double getRadius() {
	  return radius;
  }
  
  public void setRadius(double radius) {
	  this.radius=radius;
  }
  
  public double getArea() {
	  return Math.PI*radius*radius;
  }
  
  public double getPerimeter() {
	  return 2*Math.PI*radius;
  }
  
  public double getDiameter() {
	  return 2*radius;
  }
  
  public void printCircle() {
	  System.out.println("The circle is created " + getDateCreated() + "  and the radius is " + radius);
  }
}
