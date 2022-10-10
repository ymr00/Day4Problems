package snakeladder;

import java.util.Random;

public class Sluc2 {
	public static void main(String[] args) {
		int position = 0;
		System.out.println("player position :  " + position);

		Random ran = new Random();
		int num = ran.nextInt(6)+1;
		System.out.println("Player rolls die number is = " + num);
	}
}
