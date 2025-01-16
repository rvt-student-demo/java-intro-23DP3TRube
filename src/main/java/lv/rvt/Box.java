package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;


    public Box( double width, double height, double length ){
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public Box(double side){
    this(side, side, side);

    }

    // public Box(Box oldBox){
    //     this.height = oldBox.height();
    //     this.length = oldBox.length();
    //     this.width = oldBox.width();
    // }


    public double volume(){
        return this.height * this.length * this.width; 
    }
    public double area(){
        return  2 * this.height + 2 * this.width + 2 * this.length ; 
    }

    public double faceArea(){
        return this.height * this.length ;
    }
    public double topArea(){
        return this.height * this.length ;
    }
    public double sideArea(){
        return this.height * this.length ;
    }
    public double length(){
        return this.length;

}

}