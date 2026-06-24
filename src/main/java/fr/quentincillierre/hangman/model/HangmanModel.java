package fr.quentincillierre.hangman.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HangmanModel {

    public HangmanModel(String java) {
    }

    public String getWordToGuess() {
        return "";
    }

    public int getCurrentWrongs() {
        return -1;
    }

    public Set<Character> getGuessedLetter() {
        return new HashSet<>();
    }

    public void tryLetter(Character letter) {
        
    }

    public String getHiddenWord() {
        return "_______";
    }

    public boolean isWin() {
        return true;
    }

    public boolean isLose() {
        return false;
    }

    public static void main(String[] args) {
        HangmanModel game = new HangmanModel("java");
        game.tryLetter('R');
        System.out.println(game.getHiddenWord());
        game.tryLetter('A');
        System.out.println(game.getHiddenWord());
        System.out.println(game.isWin() ? "WIN" : "KEEP PUSHING");
        game.tryLetter('v');
        game.tryLetter('j');
        System.out.println(game.isWin() ? "WIN" : "KEEP PUSHING");
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        game.tryLetter('g');
        System.out.println(game.isLose() ? "LOSE" : "KEEP PUSHING");
        game.tryLetter('g');
        System.out.println(game.isLose() ? "LOSE" : "KEEP PUSHING");
    }



}
