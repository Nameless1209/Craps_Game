import java.util.Scanner;
import java.util.Random;


public class Craps_Game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain;
        int diceOne, diceTwo, diceSum, diceSumTwo;
        boolean done = false;


        do {
            System.out.println("Lets play Craps!");

            diceOne = rnd.nextInt(6) + 1;
            diceTwo = rnd.nextInt(6) + 1;
            diceSum = diceOne + diceTwo;

            System.out.println("You rolled a " + diceOne + " & " + diceTwo + " Which equals a sum of " + diceSum);
            if ((diceSum == 2) || (diceSum == 3) || (diceSum == 12)) {
                System.out.println("You crapped out. would you like to play again? Y/N");
                if (in.hasNext()) {
                    playAgain = in.next();

                    if (playAgain.equalsIgnoreCase("y")) {
                        done = false;
                    } else {
                        done = true;
                    }
                }
            } else if (diceSum == 7 || diceSum == 11) {
                System.out.println("Your a natural! Play again? Y/N");
                if (in.hasNext()) {
                    playAgain = in.next();

                    if (playAgain.equalsIgnoreCase("y")) {
                        done = false;
                    } else {
                        done = true;
                    }
                }
            } else {
                System.out.println(diceSum + " is the new point sum. roll a 7 and you lose. roll the point and you win");
                diceOne = rnd.nextInt(6) + 1;
                diceTwo = rnd.nextInt(6) + 1;
                diceSumTwo = diceOne + diceTwo;

                if (diceSumTwo == 7) {
                    System.out.println("You rolled a seven. you lost, play again? Y/N");
                    if (in.hasNext()) {
                        playAgain = in.next();

                        if (playAgain.equalsIgnoreCase("y")) {
                            done = false;
                        } else {
                            done = true;
                        }
                    }
                } else if (diceSumTwo == diceSum) {
                    System.out.println("you rolled " + diceSumTwo + ". You win! play agaim? Y/N");
                    if (in.hasNext()) {
                        playAgain = in.next();

                        if (playAgain.equalsIgnoreCase("y")) {
                            done = false;
                        } else {
                            done = true;
                        }

                    }
                }
                else if (diceSumTwo != diceSum){
                    for (var i = 0; (diceSumTwo != diceSum); i++){
                        diceOne = rnd.nextInt(6) + 1;
                        diceTwo = rnd.nextInt(6) + 1;
                        diceSumTwo = diceOne + diceTwo;

                        if (diceSumTwo == 7){
                            System.out.println("You lost. you rolled a 7. play again Y/N");
                              if (in.hasNext()) {
                                playAgain = in.next();

                                if (playAgain.equalsIgnoreCase("y")) {
                                    done = false;
                                } else {
                                    done = true;
                                }
                              }
                        } else if (diceSum == diceSumTwo) {
                            System.out.println("You got the point! You win. Play again? y/n");
                            if (in.hasNext()) {
                                playAgain = in.next();

                                if (playAgain.equalsIgnoreCase("y")) {
                                    done = false;
                                } else {
                                    done = true;
                                }
                            }

                        }
                    }

                }


            }


        } while (!done);


    }
}



