package com.company;

public class Rectangle {
    double x;double y;

    public Rectangle(double x,double y){
        this.x=x;this.y=y;
        createdRectangles++;
    }

    public Rectangle(double x){
        this.x=x;this.y=x;
        createdRectangles++;
    }

    public double calculateArea(){
        return x*y;
    }

    public void printArea(){
        System.out.println(calculateArea());
    }

    public void printRectangleKind(){
        if (this.x==this.y){System.out.println( "Это квадрат");}
        else{System.out.println("Это прямоугольник");}
    }

    public boolean isTheSameRectangle(Rectangle rectangle){
        if (this.x==rectangle.x&&this.y==rectangle.y){return true;}else{return false;}
    }

    private static int createdRectangles;

    public static void printCreatedRectangles(){
        System.out.println("Всего было создано "+createdRectangles+" прямоугольников");
    }

    private final static String RUSSIAN_CLASS_NAME="Прямоугольник";
    private final static String ENGLISH_CLASS_NAME="Rectangle";
    public static void printClassName(boolean printRussian){
        if (printRussian==false){System.out.println(ENGLISH_CLASS_NAME);}
        else{System.out.println(RUSSIAN_CLASS_NAME);}
    }
}
