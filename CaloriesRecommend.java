import java.util.Scanner;

public class CaloriesRecommend {
    int egg = 78;
    int banana = 105;
    int apple = 95;
    int soda = 150;
    int cereal = 150;
    int qty = 0;


    public int recommend() {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many eggs have you had today? (1 = 78 calories): ");
    qty = keyboard.nextInt();
    egg = qty * 78;

    System.out.println("How many bananas have you had today? (1 = 105 calories): ");
    qty = keyboard.nextInt();
    banana = qty * 105;

    System.out.println("How many apples have you had today? (1 = 95 calories): ");
    qty = keyboard.nextInt();
    apple = qty * 95;

    System.out.println("How much soad have you had today? (1 = 150 calories): ");
    qty = keyboard.nextInt();
    soda = qty * 150;

    System.out.println("How many bowls of cereal have you had today? (1 = 150 calories): ");
    qty = keyboard.nextInt();
    cereal = qty * 150;

    int entry = egg + banana + apple + soda + cereal;

    return entry;
    }
}