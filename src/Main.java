import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double r, x, y, z, h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер геометрической фигуры. 1- Круг. 2- Треугольник. 3- Прямоугольник");
        n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("Выбран Круг. Введите радиус");
                r = circle(scan.nextDouble());
                if (r > 0)
                    System.out.println("Площадь круга равна " + r);
                else
                    System.out.println("Введено неверное значение радиуса");
                break;

            case 2:
                System.out.println("Выбран треугольник. Введите его стороны");
                x = scan.nextDouble();
                y = scan.nextDouble();
                z = scan.nextDouble();
                h = triangle(x, y, z);

                if (h != -1)
                    System.out.println("Площадь треугольника равна " + h);
                else
                    System.out.println("Введены неверные значения сторон треугольника");
                break;

            case 3:
                System.out.println("Выбран прямоугольник. Введите его стороны");
                x = scan.nextDouble();
                y = scan.nextDouble();
                h = rectangle(x, y);

                if (h != -1)
                    System.out.println("Площадь прямоугольника равна " + h);
                else
                    System.out.println("Введены неверные значения сторон прямоугольника");
                break;

            default:
                System.out.println("Не выбрана фигура, либо выбран несуществующий номер");

        }
    }

    public static double circle(double r) {
        return Math.PI * r * r;
    }

    public static double triangle(double x, double y, double z) {

        if (x > 0 && y > 0 && z > 0 && (x + y > z) && (x + z > y) && (z + y > x)) {
            double p = (x + y + z) / 2;
            return Math.sqrt(p * (p - x) * (p - y) * (p - z));
        } else
            return -1;
    }

    public static double rectangle(double x, double y) {
        if (x > 0 && y > 0) {

            return x * y;
        } else
            return -1;

    }
}