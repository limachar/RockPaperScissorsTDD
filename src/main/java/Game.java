import java.util.Scanner;

public class Game {

    Rock rock = new Rock("ROCK");
    Papers paper = new Papers("PAPER");
    Scissors scissors = new Scissors("SCISSORS");
    Computer computer = new Computer(rock, paper, scissors);


    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("***WELCOME TO ROCK PAPER SCISSORS!***");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            String choice = sc.next().toUpperCase();


            switch (choice) {
                case "ROCK", "PAPER", "SCISSORS" -> {
                    int random = computer.generateRandomNumber();
                    System.out.println();
                    System.out.println(compareUserChoiceToComputerChoice(choice, computer.findAvailableGestureByNumber(random)));
                    System.out.println();
                }

            }
        }
    }

    public String compareUserChoiceToComputerChoice(String userChoice, String computerChoice) {
        if(userChoice.equals(computerChoice)){
            System.out.print("Your choice: " + userChoice + " ");
            System.out.println(" -- Computer choice: " + computerChoice);
            return "DRAW";
        }
        else if((userChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) || (userChoice.equals("PAPER") && computerChoice.equals("ROCK")) || (userChoice.equals("SCISSORS") && computerChoice.equals("PAPER"))){
            System.out.print("Your choice: " + userChoice + " ");
            System.out.println(" -- Computer choice: " + computerChoice);
            return "USER WINS";
        }
        else{
            System.out.print("Your choice: " + userChoice + " ");
            System.out.println(" -- Computer choice: " + computerChoice);
            return "COMPUTER WINS";
        }

    }
}
