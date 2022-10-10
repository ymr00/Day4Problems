package snakeladder;

import java.io.PrintWriter;
import java.util.Scanner;

public class SnakeLadderSimulatoruc6
{
	 PrintWriter writer = new PrintWriter(System.out, true);
	    Scanner scanobj = new Scanner(System.in);

	    public SnakeLadderSimulatoruc6() {
	        writer.println(" Snake & ladder Simulator");
	    }

	    public static void main(String[] args) {
	        SnakeLadderSimulator snakeladderObj = new SnakeLadderSimulator();
	        Player player1 = new Player();

	    }
	}
	class Player extends SnakeLadderSimulator{
	    int current_postion =0;
	    int startng_position = 0;
	    int winning_position = 100;
	    Player(){
	        setThePosion( );
	       // int dieNumber = rollDie();
	        //writer.println(" die number = " + dieNumber);
	    }
	    public void setThePosion( ){
	        writer.println(" starting postion of Player1 = " +startng_position );
	        checkPlayOption();
	    }

	    public int rollDie(){
	        int dieOutCome = (int) (Math.floor(Math.random() * 6)+1);
	        return dieOutCome;
	    }
	    public void checkPlayOption() {
	        int move = 0;
	        while(current_postion != winning_position) {
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
	    }

}
