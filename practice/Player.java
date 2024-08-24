package practice;

public enum Player {
    PAPER(1),
    ROCK(2),
    SCISSOR(3);

    int value;
    Player(int value){
        this.value = value;
    }
}
