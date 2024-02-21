Liskov Substitution :
If class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

public class Shape {
  public double getArea(){
    return 0.0;
  }

public class Circle extends Shape {
  private double radius;

  Circle(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return Math.PI * radius*radius;
  }
}

public class Rectangle extends Shape {
  private double width;
  private double height;

  Rectangle(double width, double height){
    this.width=width;
    this.height=height;
  }

  public double getArea(){
  return 2*(width*height);
  }
}


//Here's how LSP is applied
Shape circleShape = new Circle(5);
Shape rectangleShape = new Rectangle(4,6);

System.out.println("Circle Area"+ circleShape.getArea());
System.out.println("Rectangle Area"+ rectangleShape.getArea());
