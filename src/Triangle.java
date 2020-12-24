public class Triangle {
    int a, b, c;
    int Ololo = 1;

    Triangle(int a, int b, int c) {
        if (a+b>c & a+c>b & b+c>a) {
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else {
            Ololo = 0;
            System.out.println("Такого треугольника не существует");
        }
    }

    int P(){ return a+b+c; }
    double ehehe(){
        double p = ((double) a + (double) b + (double) c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}