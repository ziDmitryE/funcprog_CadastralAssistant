import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рекомендованную цену за квадратный метр");
        int recommendPrice = sc.nextInt();

        Site site1 = new Site("1", 10, 10, 1000000);
        Site site2 = new Site("2", 20, 20, 2000000);
        Site site3 = new Site("3", 30, 30, 3000000);

        deal(site1, recommendPrice);
        deal(site2, recommendPrice);
        deal(site3, recommendPrice);

        sc.close();
    }

    public static void deal(Site obj, int recommendPrice) {
        if (obj.saleCost / (obj.length * obj.width) >= recommendPrice) {
            System.out.println("Для объекта " + obj.name + " сделка честная");
        } else System.out.println("Для объекта " + obj.name + " сделка нечестная");
    }
}
