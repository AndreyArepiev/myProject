import java.util.Scanner;
public class циклы {
    public static void main(String[] args) {
       /* String quote = "Я никогда не буду работать за копейки. Амиго";
        int i=0;
        while (i<100){
            System.out.println(quote);
        i++;}//простая программа выводит 100 раз текст quote
        Scanner sc=new Scanner(System.in);
        String text = " любит меня.";
        System.out.print("Ваше имя?:");
        String a=sc.nextLine();
        int n=0;
        while (n<10){
            System.out.println(a+text);
            n++;
        }//программа считывает имя и добавляет текст и печатает 10 раз

        */
        /*Scanner sc=new Scanner(System.in);


        int sum=0;
        while (sc.hasNextLine()){
            String i=sc.nextLine();

             if (i.equals("ENTER")){
                break;}
            sum+=Integer.parseInt(i);


        };
        System.out.println(sum);*/
        /*int a=0;
        while (a<10){
            int b=0;
            while (b<10){
                if (a==0)
                    System.out.print(a*10+b*1+"  ");
                else
                System.out.print(a*10+b*1+" ");
                b++;
            }
            a++;
            System.out.println();

        }*/
        int a=0;
        while (a<10){
            int b=0;
            while (b<20){
                if (a==0)
                    System.out.print("Б");
                else if (a==9)
                    System.out.print("Б");
                else if (b==0)
                    System.out.print("Б");
                else if (b==19)
                    System.out.print("Б");
                else if (b>0&&b<19)
                    System.out.print(" ");
                else
                    System.out.print(b);
                b++;
            }
            a++;
            System.out.println();

        }
    }
}
