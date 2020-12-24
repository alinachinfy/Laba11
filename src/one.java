import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите стороны треугольника: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Triangle sessia = new Triangle(a,b,c);
        if (sessia.Ololo==1) {
            System.out.println("Периметр: " + sessia.P() + "\n Площадь: " + sessia.ehehe());
        }

        System.out.println("Введите стороны прямоугольника:");
        int storonaA = sc.nextInt();
        int storonaB = sc.nextInt();
        Rectangle storona = new Rectangle(storonaA, storonaB);
        System.out.println("Длина сторон равна: " + storona.sum() + "\n Периметр: " + storona.P()+ "\n Площадь: " + storona.ehehe());

        Spoki w= new Spoki(9);
        w.inputSpo();
        w.sortSpo1();
        w.outputSpo();
    }
}
