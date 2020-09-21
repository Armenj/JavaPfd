package pawlentin;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");  //hello - это функция которая возвращает нам текст переменной somebody
        hello("user");
        hello("armen");

        Square s = new Square(5);  //передаваемые значения из конструктора
        Rectangle r = new Rectangle(4, 6); //передаваемые значения из конструктора

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));


    }

    //можно использовать одинаковые имена переменных, если они в разных функциях.

    public static void hello(String somebody) {       //somebody это переменная = любое слово. Прим: world
        System.out.println("Hello  " + somebody + " "); //это мы создали функцию hello, что бы каждый раз не писать SOUT

    }

    public static double area(Square s) {   //это функция которая вычисляет площать квадрата. len - переменная
        return s.l * s.l;
    }

    public static double area(Rectangle r) {  //функция для вычисления площади прямоуг-ка. У него 2 стороны.

        return r.a * r.b;
    }
}

