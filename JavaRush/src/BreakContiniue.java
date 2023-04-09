import java.util.Scanner;
public class BreakContiniue {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        while (true) {
            String a=sc.nextLine();
        if(a.equals("enough"))
        break;
            System.out.println(a);
        }*/
        /*int a=1;
        int sum=0;
        while (a<=100){
            if((a%3)==0){
                a++;
                continue;}
            sum=sum+a;
            a++;
        }
        System.out.println(sum);

         */


        /*int sum1=0;
        int р=1;
        while (р<=100){
            if((р%3)!=0){
                р++;
                continue;}
            sum1=sum1+р;
            р++;
        }System.out.println(sum1);

         */

       /* Scanner sc=new Scanner(System.in);//поиск и вывод минимального значения числа из введенных
        int min=Integer.MAX_VALUE;
        while (sc.hasNextInt()){
            int x= sc.nextInt();
            if (x<min)
                min=x;
        }
        System.out.println(min);

        */


        /*Scanner st=new Scanner(System.in);//поиск и вывод максимального значения числа из введенных
        int max=Integer.MIN_VALUE;
        while (st.hasNextInt()){
            int x= st.nextInt();
            if (x>max)
                max=x;
        }
        System.out.println(max);

        Scanner st2=new Scanner(System.in);//поиск и вывод максимального четного значения числа из введенных
        int max2=Integer.MIN_VALUE;
        while (st2.hasNextInt()){
            int x= st2.nextInt();
            if (x>max2&&x%2==0)
                max2=x;
        }
        System.out.println(max2);

         */
       /* Scanner sc=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        while (sc.hasNextInt()){
            int x = sc.nextInt();
            if (x < min) {
                min2 = min;
                min = x; }
            if ((x > min) && (x < min2))
                min2 = x;
        }
        System.out.println(min2);

        */
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
                min++;
                continue;
            }
            // else if (x < min) {
            //    min = x;
            //  }
        }
        System.out.println(min);




    }
}
