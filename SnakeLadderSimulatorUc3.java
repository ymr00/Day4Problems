package snakeladder;

import java.io.PrintWriter;
import java.util.Scanner;

public class SnakeLadderSimulatorUc3 {
	 PrintWriter writer = new PrintWriter(System.out, true);
	    Scanner scanobj = new Scanner(System.in);

	    public SnakeLadderSimulatorUc3() {
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
	        int randomDieNumber = rollDie();
	        System.out.println(randomDieNumber);
	        int checkNumber = (int)(Math.floor(Math.random() *2 )+ 1);
	        System.out.println(checkNumber);
	        switch (checkNumber) {
	            case 0:
	                System.out.println("No move Player stay in the same position");
	                current_postion = current_postion + 0;
	                break;
	            case 1:
	                System.out.println(" move ahead");
	                current_postion = current_postion + randomDieNumber ;
	                break;
	            case 2:
	                System.out.println(" move behind");
	                current_postion = current_postion - randomDieNumber ;
	                break;
	        }
	        System.out.println("postion = " + current_postion);
	    }

}
