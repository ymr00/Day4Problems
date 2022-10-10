package snakeladder;

import java.io.PrintWriter;
import java.util.Scanner;

public class SnakeLadderSimulator {
	 PrintWriter writer = new PrintWriter(System.out, true);
	    Scanner scanobj = new Scanner(System.in);

	    public SnakeLadderSimulator() {
	        writer.println(" Snake & ladder Simulator");
	    }

	    public static void main(String[] args) {
	        SnakeLadderSimulator snakeladderObj = new SnakeLadderSimulator();
	        Player player1 = new Player();
	        player1.startGame();

	    }
	}
	class Player extends SnakeLadderSimulator{
	    int current_postion =0;
	    int startng_position = 0;
	    final static int WINING_POSITION = 100;

	    public int rollDie(){
	        int dieOutCome = (int) (Math.floor(Math.random() * 6)+1);
	        return dieOutCome;
	    }
	     
		public int checkPlayOption() {
	        int move = 0;
	        while(current_postion != WINING_POSITION) {
	            int randomDieNumber = rollDie();
	            System.out.println("Die number = " + randomDieNumber);
	            int checkNumber = (int) (Math.floor(Math.random() * 3) );
	            System.out.println("movement number = " +checkNumber);

	            switch (checkNumber) {
	                case 0:
	                        System.out.println("No move Player stay in the same position");
	                    System.out.println("Player postion = " + current_postion);
	                    break;
	                case 1:
	                        System.out.println(" move ahead");
	                        current_postion = current_postion + randomDieNumber;
	                    if (current_postion > 100 )
	                        current_postion = current_postion - randomDieNumber;
	                    System.out.println("Player postion = " + current_postion);

	                    break;
	                case 2:
	                        System.out.println(" move behind");
	                        current_postion = current_postion - randomDieNumber;
	                    if (current_postion < 0 )
	                        current_postion = 0;
	                    System.out.println("Player postion = " + current_postion);
	                    break;
	            }

	            move++;

	        }
	        System.out.println("Player winning postion = " + current_postion);
	        System.out.println("Number of moves to win = " + move);

	        return  current_postion;
	    }
	    public boolean isWin(int playerPosition) {
	        return WINING_POSITION == playerPosition;
	    }

	    public void startGame(){
	        int player1Position = 0 , player2Position = 0;
	    int currentPlayer = -1;
	        String rPressed;
	        int diceValue = 0;
	        do{
	            System.out.println(currentPlayer== -1
	                    ? "\n\nFirst player's turn" : "\n\nSecond player's turn");
	            System.out.println("Press 'r' to roll Dice");
	            rPressed=scanobj.next();
	            diceValue=rollDie();
	            if (currentPlayer==-1) {
	                player1Position =  checkPlayOption();
	                System.out.println("First Player Position:"+player1Position);
	                System.out.println("Second Player Position:"+player2Position);
	                System.out.println("-------------------------");
	                if (isWin(player1Position)) {
	                    System.out.println("Congratulations! First player won");
	                    return;
	                }
	            } else {
//	                player2Position = checkPlayOption(player2Position, diceValue);
	                player2Position = checkPlayOption();
	                System.out.println("First Player Position:"+player1Position);
	                System.out.println("Second Player Position:"+player2Position);
	                System.out.println("-------------------------");
	                if (isWin(player2Position)) {
	                    System.out.println("Congratulations! Second player won");
	                    return;
	                }
	            }
	            currentPlayer = -currentPlayer;
	        } while ("r".equals(rPressed));
	    }

}
