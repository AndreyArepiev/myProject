import java.util.Scanner;
public class СравнениеСтрок {
    public static String secret = "AmIGo";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        if (a.equals(b))
            System.out.println("строки одинаковые");
        else System.out.println("строки разные");

            String secret2=sc.nextLine();
            if (secret.equalsIgnoreCase(secret2))//напишите тут ваш код
                System.out.println("доступ разрешен");
            else//напишите тут ваш код
                System.out.println("доступ запрещен");

        }
}
