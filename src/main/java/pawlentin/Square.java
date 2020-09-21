package pawlentin;

public class Square {
    public double l;

    public Square(double l) { //создали конструктор
        this.l = l;
    }

    public double area() {   //это функция которая вычисляет площать квадрата. len - переменная
        return this.l * this.l;
    }
}
