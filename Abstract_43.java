package Assignments;

abstract class Shape {
	    abstract double area();
	    void displayArea() {
	        System.out.println("The area of the shape is: " + area());
	    }
	}
	class Circle extends Shape {
	    double radius;
	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }
	}
	class Rectangle extends Shape {
	    double length, width;
	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    double area() {
	        return length * width;
	    }
	}

	public class Abstract_43 {
	    public static void main(String[] args) {
	        Shape circle = new Circle(5.0);
	        Shape rectangle = new Rectangle(4.0, 6.0);

	        circle.displayArea();
	        rectangle.displayArea();
	    }
	}
