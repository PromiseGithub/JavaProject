import java.util.Scanner;


public class Main{

    public static void main(String[] args) 
        {
            CaloriesConsume calo = new CaloriesConsume();
            double calories = calo.calories();
            String answer = "";

            Scanner keyboard = new Scanner(System.in);
    
            System.out.println("Would you like to know where you at for today: Y or N: ");
            answer = keyboard.nextLine();

            if (answer.equals("Y") || answer.equals("Yes") || answer.equals("y") || answer.equals("yes")) {
                CaloriesRecommend recommend = new CaloriesRecommend();
                int caloRecom = recommend.recommend();

                System.out.println("You have consumed " + caloRecom + " calories today");

                if (caloRecom < calories) {
                    double lowCalo = calories - caloRecom;
                    System.out.println("You are almost there, you have " + lowCalo + "calories to go");
                }

                else if (caloRecom > calories) {
                    double highCalo = caloRecom - calories;
                    System.out.println("Congratulations, You have exceded your recommended calories by " + highCalo);
                }
            }

            else {
                System.out.println("Thank you for using our app");
            }
        }
    }