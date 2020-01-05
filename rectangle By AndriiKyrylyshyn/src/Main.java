    public class Main {

        public static void main(String args[]) {

            Rectangle area = new Rectangle(8);
            Rectangle perimeter = new Rectangle(4, 6);

            System.out.println("Площа прямокутника = " + area.area()+"m2");
            System.out.println("Периметр прямокутника = " + perimeter.perimeter()+"m2");
        }
    }
