package src;

public class Rectangle {
    public int length;
    public int width;
    public int perimeter;
    public int area;


    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    Rectangle (){

    }
    public void getperimeter(){
        perimeter = 2 * (length+width);
        System.out.println("Периметр прямокутника = " + perimeter + " (см).");
    }
    public void getarea(){
        area = length * width;
        System.out.println("Площа прямокутника = " + area + " (см²).");
    }
}
