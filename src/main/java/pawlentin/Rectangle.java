package pawlentin;

public class Rectangle {
    public double a;
    public double b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    public double area() {  //функция для вычисления площади прямоуг-ка. У него 2 стороны.

        return this.a * this.b;
    }
}
