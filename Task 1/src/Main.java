import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isCanMake = false;
        int toadEyesCount = 0;
        int ghoulTearsCount = 0;
        int ravenBonesCount = 0;
        int dumplingsCount = 0;

        System.out.println("Введите количество жабьи глазов: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество слезы вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество кости ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество пельмени: ");
        dumplingsCount = new Scanner(System.in).nextInt();

        if(toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("\n\nВы сможете сделать: Эликсир зоркости");
            isCanMake = true;
        }
        if(ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы сможете сделать: Эликсир стойкости");
            isCanMake = true;
        }
        if((ghoulTearsCount >= 7 && dumplingsCount >= 1) && toadEyesCount >= 2) {
            System.out.println("Вы сможете сделать: Эликсир скрытности");
            isCanMake = true;
        }
        if((ravenBonesCount >= 3 && dumplingsCount >= 10) && (ghoulTearsCount >= 5 && toadEyesCount >= 4)) {
            System.out.println("Вы сможете сделать: Запретный эликсир");
            isCanMake = true;
        }
        if (!isCanMake){
            System.out.println("К сожалению у вас не хватает ингредиентов");
        }
    }
}
