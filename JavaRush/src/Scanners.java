import java.util.Scanner;
public class Scanners {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        String st3=sc.nextLine();
        System.out.println(st3);
        System.out.println(st2.toUpperCase());
        System.out.println(st1.toLowerCase());
        String str ="1 2 3 4";
        Scanner sct=new Scanner(str);
        int a= sct.nextInt();
        int b= sct.nextInt();
        int c= sct.nextInt();
        int d= sct.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a+b+c+d);




    }
}
