
  import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
     Scanner sc=new Scanner(System.in);
     int a= sc.nextInt();
     if (a<0)
         System.out.println(cold);
     else System.out.println(warm);
        String militaryCommissar =", Явитесь в военкомат";
     Scanner st=new Scanner(System.in);
        System.out.println("Ваше имя?");
        String с=st.nextLine();
        int b= st.nextInt();
        if (b>=18) //if (b>=18&&b<=28) другой вариант
            if (b<=28)
            System.out.println(с+militaryCommissar);
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
            if (age >= 6)
                System.out.println("нужно ходить в школу");}
            else
                System.out.println("пора в институт");


    }
}
