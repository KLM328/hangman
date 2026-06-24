package fr.quentincillierre.hangman.model;

import fr.quentincillierre.hangman.GameMode;

import java.time.Clock;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Timer;

public class HangmanModel {
    private final String wordToGuess;
    private final int maxWrongs;
    private int currentWrongs;
    private Set<Character> guessedLetter;
    private boolean timeOut;

    public HangmanModel(String wordToGuess) {
        this.wordToGuess = wordToGuess.toUpperCase();
        this.maxWrongs = 10;
        this.currentWrongs = 0;
        this.guessedLetter = new LinkedHashSet<>();
        this.timeOut = false;
    }

    public void setTimeOut(boolean timeOut) {
        this.timeOut = timeOut;
    }

    public Set<Character> getGuessedLetter() {
        return guessedLetter;
    }

    public int getCurrentWrongs() {
        return currentWrongs;
    }
     public String getWordToGuess(){
        return this.wordToGuess;
     }

    public void tryLetter(Character letter){
        letter = Character.toUpperCase(letter);
        if (this.guessedLetter.contains(letter)){
            return;
        }
        if (!wordToGuess.contains(letter.toString())){
            currentWrongs++;
        }
        guessedLetter.add(letter);
    }

    public String getHiddenWord(){
        StringBuilder hiddenWord = new StringBuilder();

        for (int i = 0; i<wordToGuess.length(); i++){
            Character letter = wordToGuess.charAt(i);
            if (guessedLetter.contains(letter)){
                hiddenWord.append(letter);
            }else {
                hiddenWord.append('_');
            }
        }
        return hiddenWord.toString().trim();
    }

    public boolean isWin(){
        for (Character letter : this.wordToGuess.toCharArray()){
            if (!this.guessedLetter.contains(letter))
                return false;
        }
        return true;
    }

    public boolean isLose(){
        return (currentWrongs >= maxWrongs || this.timeOut);
    }

    public static void main(String[] args){
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

        System.out.println(game.getGuessedLetter());

        System.out.println();




    }



}
