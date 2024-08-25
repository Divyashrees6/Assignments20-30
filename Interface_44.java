package Assignments;
interface Displayable {
 void display();
}

class Message implements Displayable {
 String text;

 Message(String text) {
     this.text = text;
 }

 @Override
 public void display() {
     System.out.println("Message: " + text);
 }
}

class Number implements Displayable {
 int value;

 Number(int value) {
     this.value = value;
 }

 @Override
 public void display() {
     System.out.println("Number: " + value);
 }
}

public class Interface_44 {
 public static void main(String[] args) {
     Displayable message = new Message("Hello, World!");

     Displayable number = new Number(123);

     message.display();
     number.display();
 }
}
