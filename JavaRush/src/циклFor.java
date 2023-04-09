import java.util.Scanner;
public class циклFor {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        */
        /*Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum =0;
        for (int i=start;i<end;i++){
            if ((i%multiple)!=0)
                continue;
            sum=sum+i;
        }

        System.out.println(sum);

         */
        /*
        for (start;start<end;start++){
            if ((start%multiple)!=0)
                continue;
            sum=sum+start;
        }
        System.out.println(sum);

        /*for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }


        /*
        for (int a=1;a<21;a++)
        {
            if (a<10)
                System.out.print("Строка№"+a+":  ");
            else
            System.out.print("Строка№"+a+": ");
            int count = a+1;
            for (int b=1;b<count;b++)
                System.out.print("8");
            System.out.println();
        }

         */

        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
