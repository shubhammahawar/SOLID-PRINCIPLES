Open-Closed Principle -- 

It’s now time for the O in SOLID, known as the open-closed principle. Simply put, classes should be open for extension but closed for modification. 
  In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.

// We have created the abstract Shape class and created concrete class Rectangle and Circle by extending Shape class without modifying the existing code

abstract class Shape {
  public abstract double area();
}

public class Circle extends Shape{
  
double radius;
  public Circle(double radius)
  {
    this.radius = radius;
}

@Override
  public double area(){
  return Math.PI * radius* radius;
}
}


public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height){
    this.width=width;
    this.height=height;
  }

@Override
  public double area(){
    return 2*(width*height);
  }
}


  

  



    
