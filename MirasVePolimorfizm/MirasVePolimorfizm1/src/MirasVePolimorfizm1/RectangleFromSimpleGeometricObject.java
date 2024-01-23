package MirasVePolimorfizm1;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(double width , double height) {
		this.width=width;
		this.height=height;
	}
	
	public RectangleFromSimpleGeometricObject(double width , double height , String color , boolean filled) {
		this.height=height;
		this.width=width;
		setColor(color);
		setFilled(filled);	
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth() {
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight() {
		this.height=height;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*(height + width);
	}
}
