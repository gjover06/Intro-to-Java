package chapter11.section2to4;

public class Triangle extends GeometricObject {
    private double side1 ;
    private double side2 ;
   private double side3 ;

    public Triangle(){
         side1 =1.0;
         side2 =1.0;
         side3 =1.0;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        return side1*side2*side3;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
