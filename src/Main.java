import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Введите сколько у вас денег");
        int money = sc.nextInt();

        System.out.println("Введите цену одной шоколадки");
        int price = sc.nextInt();

        System.out.println("Введите количество обёрток, за которые дают бесплатную шоколадку");
        int wrap = sc.nextInt();

        int chocolate = 0;
        int freechocolate = 0;

        while (money -price >= 0){
            money = money - price;
            chocolate = chocolate+1;
            if (chocolate % wrap == 0){freechocolate = freechocolate+1;
                if (freechocolate % wrap == 0){freechocolate = freechocolate+1;
                }
            }
        }
        System.out.println("Вы смогли купить " + (chocolate + freechocolate) + " шоколадок");

    }
}