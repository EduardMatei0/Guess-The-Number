package academy.learnprogramming;

public interface Game {

    public int getNumber();
    public int getGuess();
    public void setGuess(int guess);
    public int getSmallest();
    public int getBiggest();
    public int getRemainingGuesses();
    public int getGuessCount();
    public void reset();
    public void check();
    public boolean isValidNumberRange();
    public boolean isGameWon();
    public boolean isGameLost();
}
