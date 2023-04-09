import java.util.Scanner;
public class booleann {
    private static boolean isHigh;
    private static boolean isLow;
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh=(bodyTemperature > 37);
        isLow=(bodyTemperature <36);
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }*/
        /*Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a==b&&b==c&&a==c) System.out.println(a+" "+b+" "+c);
        else if (a==b) System.out.println(a+" "+b);
        else if (b==c) System.out.println(c+" "+b);
        else if (a==c)
            System.out.println(a+" "+c);*/
       /* Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        boolean a1=(a<(b+c));
        boolean a2=(b<(c+a));
        boolean a3=(c<(a+b));
        if (a1&&a2&&a3) System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);*/

        /*Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if (a>60||a<20)
            System.out.println("Можно не работать");*/
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        if (x>0&&y>0) System.out.println(1);
        else if (x<0&&y>0) System.out.println(2);
        else if (x<0&&y<0) System.out.println(3);
        else if (x>0&&y<0) System.out.println(4);





    }
}
