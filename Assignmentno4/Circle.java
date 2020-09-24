class Circle{
private double radius;
private double area;
public Circle() {  
      radius = 1.0;
      area = 2.5;
   }
   public Circle(double r) {  
      radius = r;
      area=area;
   }
   public double getRadius() {
     return radius; 
   }
    public double getArea() {
      return radius*radius*Math.PI;
   }
}
   class CircleDemo { 
   public static void main(String[] args) {
      
      Circle c1 = new Circle();
      
      Circle c2 = new Circle(2.0);
      
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
   }
}

