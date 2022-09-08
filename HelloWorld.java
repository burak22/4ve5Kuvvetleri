import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("4ün Kuvvetleri: ");
        for (int i = 0; Math.pow(4,i) <= num; i++) {
            System.out.println(Math.pow(4,i));
        }
        System.out.println("--------------------------");
        System.out.println("5in Kuvvetleri: ");
        for (int j = 0; Math.pow(5,j) <= num; j++) {
            System.out.println(Math.pow(5,j));
        }
        sc.close();
    }                   
}