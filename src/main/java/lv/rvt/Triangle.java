package lv.rvt;

public class Triangle extends GeometricShape {
    
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;


    }


    @Override
    public double getArea(){
        
        return side1 * side2 * side3;
    }


    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }


    @Override
    public void displayInfo(){
        System.out.println("Area is: " + getArea());
        System.out.println("Parameter is:" + getPerimeter());
    }
}
