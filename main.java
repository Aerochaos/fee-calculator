import java.util.Scanner;

public class Main {
    public static int calculateCustoms(int price, int weight) {
        int result = price / 100 + weight * 100;
        //System.out.println("Размер пошлины (в руб.) составит: " + result);
        return result;

    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите цену товара(в руб.):");
    int price = scanner.nextInt();
    System.out.print("Введите вес товара (в кг.):");
    int weight = scanner.nextInt();
    int duty = calculateCustoms(price,weight);
    System.out.println("Размер пошлины (в руб.) составит:"+duty);


    }
}
