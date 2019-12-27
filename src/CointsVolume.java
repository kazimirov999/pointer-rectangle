import java.util.Scanner;

class CointsVolume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length1, width1;
        System.out.println("Введить довжину");
        length1 = sc.nextInt();

        System.out.println("Введить ширину");
        width1 = sc.nextInt();


        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length1, width1);
        printRectangleVolume(rectangle1);
        printRectangleVolume2(rectangle2);
    }

    static void printRectangleVolume(Rectangle rectangle1) {
        System.out.println("Площа = " + rectangle1.getVolume());
    }

    static void printRectangleVolume2(Rectangle rectangle2) {
        System.out.println("Периметр = " + rectangle2.getVolume2());
    }
}
