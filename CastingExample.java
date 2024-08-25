package Assignments;
	// Parent class
	class Parent {
	    public void nonStaticMethodParent() {
	        System.out.println("Non-static method in Parent class");
	    }

	    public static void staticMethodParent() {
	        System.out.println("Static method in Parent class");
	    }
	}

	// Child class extending Parent class
	class Child extends Parent {
	    public void nonStaticMethodChild() {
	        System.out.println("Non-static method in Child class");
	    }

	    public static void staticMethodChild() {
	        System.out.println("Static method in Child class");
	    }
	}

	public class CastingExample {
	    public static void main(String[] args) {
	        Child child = new Child();

	        // Upcasting: Child to Parent
	        Parent parent = child;

	        // Non-static method call (Parent's method)
	        parent.nonStaticMethodParent();  // Calls Parent's non-static method

	        // Static method call (Parent's static method)
	        Parent.staticMethodParent();  // Calls Parent's static method

	        // Downcasting: Parent to Child
	        if (parent instanceof Child) {
	            Child childFromParent = (Child) parent;

	            // Non-static method call (Child's method)
	            childFromParent.nonStaticMethodChild();  // Calls Child's non-static method

	            // Static method call (Child's static method)
	            Child.staticMethodChild();  // Calls Child's static method
	        }
	    }
	}
