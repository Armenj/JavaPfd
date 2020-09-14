package pawlentin;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");  //hello - это функция которая возвращает нам текст переменной somebody
        hello("user");
        hello("armen");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }

    //можно использовать одинаковые имена переменных, если они в разных функциях.

    public static void hello(String somebody) {       //somebody это переменная = любое слово. Прим: world
        System.out.println("Hello  " + somebody + " "); //это мы создали функцию hello, что бы каждый раз не писать SOUT

    }

    public static double area(double len) {   //это функция которая вычисляет площать квадрата. len - переменная
        return len * len;
    }

    public static double area(double a, double b) {  //функция для вычисления площади прямоуг-ка. У него 2 стороны.
        return a * b;
    }
}

public class
