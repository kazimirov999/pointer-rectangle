    public class Rectangle {

        public double length =+1;
        public double width =+1;

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

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return length * 2 + width * 2;
        }
    }
