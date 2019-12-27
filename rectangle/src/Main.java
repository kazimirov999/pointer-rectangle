public class Main {

    public static void main(String args[]) {

        Rectangle kvadrat = new Rectangle(10);
        Rectangle pryamokytnik = new Rectangle(20, 10);

        System.out.println("Площа прямокутника = " + pryamokytnik.square());
        System.out.println("Периметр прямокутника = " + pryamokytnik.perimeter());
    }
}
