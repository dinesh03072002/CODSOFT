import java.util.*;
public class guessnum {
    private static final int min_range=1;
    private static final int max_range=100;
    private static final int total_rounds=3;
    private static final int total_attempts=10;
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int Final_score='0';
        System.out.println("please enter your name :");
        String name=sc.nextLine();
        System.out.println("Hello "+ name +"!, This is number guessing game");
        System.out.printf("Total number of rounds: %d%n",total_rounds);
        System.out.printf("Total attempts per each round : %d%n%n",total_attempts);
        for(int i=1;i<=total_rounds;i++){
            int number=ran.nextInt(max_range)+min_range;
            int attempts=0;
            System.out.printf("Round %d:%nGuess the number between the %d and %d in %d attempts.%n",i,min_range,max_range,total_attempts);
            while(attempts < total_attempts){
                System.out.println("Enter your guess " + name +":");
                int guess = sc.nextInt();
                attempts+=1;
                if(guess==number){
                    int score = total_attempts-attempts;
                    Final_score+= score;
                    System.out.printf("Number guessed successfully.%nAttempts=%d %nRound score= %d%n%n",attempts,score);
                    break;
                }
                else if(guess < number){
                    System.out.printf("No!,The number is greater than %d. Attempts left=%d.%n",guess,total_attempts-attempts);
                }
                else if(guess > number){
                    System.out.printf("No!,The number is less than %d. Attempts left=%d.%n",guess,total_attempts-attempts);
                }
            }
            if(attempts == total_attempts){
                System.out.printf("\nRound= %d %n",i);
                System.out.println("Attempts=0");
                System.out.printf("The number is : %d %nTry again :)))%n%n",number);
            }
        }
        System.out.printf("Game over!Your Final scoure: %d",Final_score);
        sc.close();
    }
}