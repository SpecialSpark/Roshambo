package practice;

public class Test {

    
    public static void main(String[] args) {
    
        paperBeatRockTest();
        
    }

    public static void paperBeatRockTest(){
        Roshambo game = new Roshambo();

        int winner = game.play();
        
        if(winner == 1){
            System.out.print("pass");
        } else {
            System.out.print("fail");
        }
        //rocket da socket!!! lock-it in da pocket

    }
}