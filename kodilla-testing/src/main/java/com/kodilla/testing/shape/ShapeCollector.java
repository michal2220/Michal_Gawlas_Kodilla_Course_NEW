package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapeList = new ArrayList<>();

    public List<Shape> printList(){

        return shapeList;
    }
    public int listSize(){
        return shapeList.size();
    }
    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape){
            boolean result = shapeList.remove(shape);
            return result;
    }

    public Shape getFigure (int n){

        Shape figure = shapeList.get(n);
        return figure;
    }

    public String showFigures(){
        String shapeName ="";
        for (Shape figures : shapeList){
            String changingName= figures.getShapeName();
            shapeName=shapeName+changingName;
        }
        return shapeName;
    }
}
