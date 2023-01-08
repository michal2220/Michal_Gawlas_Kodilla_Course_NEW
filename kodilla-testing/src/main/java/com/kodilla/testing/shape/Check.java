package com.kodilla.testing.shape;

public class Check {

    public static void main (String[] args){

        ShapeCollector shapee = new ShapeCollector();
        Circle circle=new Circle(4);
        shapee.addFigure(circle);

        
        shapee.addFigure(new Circle(1));


        
        shapee.addFigure(new Triangle(1,3));



        String asdasd = shapee.showFigures();
        System.out.println(asdasd);


    }


}

