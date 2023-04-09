import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
        /*Scanner sc =new Scanner(System.in);
        int radius = sc.nextInt();
        final double pi=3.14;
        double S= pi*radius*radius;
        System.out.println((int)(S));

         */
        /*Scanner sc =new Scanner(System.in);
        int drink= sc.nextInt();
        int people= sc.nextInt();
        double result=1.0*drink/people;//чтобы в результате получилось дробное число нужно домножить на 0.1
        System.out.println(result);

         */
        /*Scanner sc =new Scanner(System.in);
        int speed=sc.nextInt();
        int result=(int) Math.round(speed*3.6);
        System.out.println(result);

         */
        double glass = 0.5;
        Scanner sc =new Scanner(System.in);
        boolean a=sc.nextBoolean();
        if (a==true)
            System.out.println((int)Math.ceil(glass));
        else if (a==false)
            System.out.println((int)Math.floor(glass));



    }
}
