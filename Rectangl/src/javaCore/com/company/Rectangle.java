package javaCore.com.company;

public class Rectangle {
    public int width;
    public int height;

    void Rectangle(int wdth, int hght){
        int w = wdth;
        int h = hght;
        int c = w * h;
        System.out.println("Площа прямокутника = " + c);
    }

    void Rectangle(){
        width = 23;
        height = 12;
        int p = 2*(width+height);
        System.out.println("Периметр прямокутника = " + p);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.Rectangle();
        rect.Rectangle(23, 12);

    }

}
