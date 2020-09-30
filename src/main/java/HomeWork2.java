import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери тип фигуры (треугольник, квадрат, прямоугольник)");
        String word = scanner.nextLine();
        System.out.println("Вы выбрали " + word);
        double perimeter;
        double area;
        switch (word) {
            case "треугольник":
                System.out.println("Для поиска периметра и площади треугольника необходимо ввести значения сторон a,b,c");
                System.out.println("Введите значения стороны a: ");
                double a = scanner.nextDouble();
                System.out.println("Введите значения стороны b: ");
                double b = scanner.nextDouble();
                System.out.println("Введите значения стороны c: ");
                double c = scanner.nextDouble();
                perimeter = (a+b+c);
                System.out.println("Периметр треугольника равна: " + perimeter);
                double halfperimeter = perimeter/2;
                area = Math.sqrt(halfperimeter*(halfperimeter-a)*(halfperimeter-b)*(halfperimeter-c)) ;
                System.out.println("Площадь треугольника равна: " + area);
                break;
            case "квадрат":
                System.out.println("Для поиска периметра и площади квадрата введите значения стороны d: ");
                double d = scanner.nextDouble();
                perimeter = (d*4);
                System.out.println("Периметр квадрата равна: " + perimeter);
                area = Math.pow(d,2);
                System.out.println("Площадь квадрата равна: " + area);
                break;
            case "прямоугольник":
                System.out.println("Для поиска периметра и площади прямоугольника ввести значения сторон e и f");
                System.out.println("Введите значения стороны e: ");
                double e = scanner.nextDouble();
                System.out.println("Введите значения стороны f: ");
                double f = scanner.nextDouble();
                perimeter = 2*(e+f);
                System.out.println("Периметр прямоугольника равна: " + perimeter);
                area = e*f;
                System.out.println("Площадь прямоугольника равна: " + area);
                break;
            default:
                System.out.println("Дичь вводишь, бро");
                break;


        }
    }
}