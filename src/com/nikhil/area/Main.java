package com.nikhil.area;

public class Main {

    public static void main(String[] args) {

        // Enter any shape
        Shapes shapeToFind = Shapes.Rectangle;

        Main main = new Main();

        // To find Area
        main.findArea(shapeToFind);

        // To find Perimeter
        main.findPerimeter(shapeToFind);

    }

    private void findArea(Shapes shape){

        switch (shape){
            case Rectangle:
                float l =10, b = 20;
                areaOfRectangle(l,b);
                break;
            case Square :
                float s=10;
                areaOfSquare(s);
                break;
            case Triangle:
                float l1 =10, b2 = 20;
                areaOfTriangle(l1,b2);
                break;
            default:

        }

    }
    private float areaOfRectangle(float l, float b){
        return l*b;
    }
    private float areaOfSquare(float s){
        return s*s;
    }
    private float areaOfTriangle(float l, float b){
        return (l*b)/2;
    }
    private void findPerimeter(Shapes shape){

        switch (shape){
            case Rectangle:
                float l =10, b = 20;
                perimeterOfRectangle(l,b);
                break;
            case Square :
                float s=5;
                perimeterOfSquare(s);
                break;
            case Triangle:
                float s1 =10; float s2 = 20 ; float s3 = 30;
                perimeterOfTriangle(s1,s2,s3);
                break;
            default:

        }
    }

    private float perimeterOfSquare(float s) {
        return 4*s;
    }

    private float perimeterOfTriangle(float s1, float s2, float s3) {
        return s1+s2+s3;
    }

    private float perimeterOfRectangle(float l, float b) {
        return 2*(l+b);
    }
}
