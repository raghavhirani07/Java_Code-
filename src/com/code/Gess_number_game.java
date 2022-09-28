package com.code;

import java.util.Random;
import java.util.Scanner;

class Game {
    int inputNumber;
    int number;
    int NoofGuesses=0;

    public int getNoofGuesses() {
        return NoofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        NoofGuesses = noofGuesses;
    }
 Game()
 {
     Random random=new Random ();
     this.number=random.nextInt (0,100);
 }
void takeUserInput(){
    System.out.println ("guess the number :");
    Scanner input=new Scanner (System.in);
    inputNumber=input.nextInt ();
}
    boolean check(){
        NoofGuesses++;
        if(number == inputNumber){
            System.out.println ("finallay to find number in "+ getNoofGuesses ()+ "time ");
            return true;
        }
        else if(number < inputNumber){
            System.out.println (" is high ...");
            return false;
        }
        else if (number > inputNumber){
            System.out.println ("is low ");

        }
        return false;
    }

}
public class Gess_number_game {
    public static void main(String[] args) {
        Game game = new Game ();
        boolean b = false;
        while (!b) {
            game.takeUserInput ();
            b = game.check ();

        }
    }
}
