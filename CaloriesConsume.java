import java.util.Scanner;


public class CaloriesConsume {

            //variables
            int age;
            int height;
            int weight;
            String gender;
            int BMR;
            char genderChar;
            boolean male;
            String exercise;
            boolean none = false;
            boolean light = false;
            boolean moderately = false;
            boolean intensely = false;
            boolean five;
            double cal;

            public double calories() {

            //Male or Female?
            Scanner keyboard = new Scanner(System.in);
    
            System.out.println("What is your gender? M or F: ");
            gender = keyboard.nextLine(); 
    
            //Determining your BMR 
    
            System.out.println("What is your age: ");
            age = keyboard.nextInt();
    
            System.out.println("What is your weight: ");
            weight = keyboard.nextInt();
    
            System.out.println("What is your height: ");
            height = keyboard.nextInt();
    
            genderChar = gender.charAt(0);
    
            male = genderChar == 'M';
    
            if (male)
            {
                BMR = (int) (66 + (6.23 * weight) + (12.7 * height) - (6.8 * age));
            }
            else
            {
                BMR = (int) (665 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
            }
    
            //Show BMR
    
            if (male)
            {
                System.out.println("Your BMR is " + BMR);
            }
            else
                System.out.println("Your BMR is " + BMR);
    
            //Level of Exercises
    
            if (none)
            {
                cal =  (BMR * 1.2);
            }
            else if (light)
            {
                cal = (BMR * 1.375);
            }
            else if (moderately)
            {
                cal = (BMR * 1.55);
            }
            else if (intensely)
            {   
                cal = (BMR * 1.725);
            }
            else
            {
                cal = (BMR * 1.9);
            }
    
            System.out.println("What is your level of exercise? ");
            System.out.println("Type in none if you do not exercise. ");
            System.out.println("Type in 2 if you engage in light exercise one to three days a week.");
            System.out.println("Type in 3 if you do exercise moderately three to five times a week.");
            System.out.println("Type in 4 if you do intensely six to seven days a week.");
            System.out.println("Type in 5 if you do exercise intensely six to seven days a week and have a physically active job.");
    
            exercise = keyboard.nextLine();
            none = keyboard.nextLine() != null;
    
            System.out.println("Your daily calorie needs is " + cal);

            return cal;

        }
  }