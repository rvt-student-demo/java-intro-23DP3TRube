package lv.rvt;

public class Circle extends GeometricShape {
    
    private double rad;

        public Circle(double rad){
            this.rad = rad;
        }


    @Override
    public double getArea(){
        return 3.14 * rad * rad;
    }

    @Override
    public double getPerimeter(){
        return 3.14 * 2 * rad;
    }

    @Override
    public void displayInfo(){
        System.out.println("Area is: " + getArea());
        System.out.println("Perimeter is: " + getPerimeter());
    }
}
