public class Rectangle {

    int length = 1, width = 1;

    public Rectangle() {
    }

    public Rectangle(int length) {
        this.length = length;
        this.width = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int square() {
        return length * width;
    }

    public int perimeter() {
        return length * 2 + width * 2;
    }
}


/*Написати клас Rectangle , в якому буде описано поля : довжина, ширина. Описати дані поля в конструкторі.
Створити конструктор з параметрами і без параметрів. Написати методи, які будуть розраховувати площу та периметр.
В Main класі продемонструвати створення об’єктів використовуючи два конструктори. Вивести на консоль площу
і периметр прямокутника. Вивід на консолі повинен мати наступний вигляд: «Площа прямокутника = тут буде площа »,
«Периметр прямокутника = тут буде периметр».*/