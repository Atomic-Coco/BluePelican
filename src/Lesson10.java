import java.io.*;
import java.util.*;

/**
 * @author klinedd
 *
 *Write a switch structure that uses the character myChar. It should increment the integer
 *variable y if myChar is either a capital or small letter G. It should decrement y if myChar
 *s either a capital or a small letter M. If myChar is anything else, add 100 to y.
 *
 *
 *
 *
 */
public class Lesson10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable Declaration
		int y =0;
		char myChar;
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter a letter. ");
		myChar = kbReader.next().charAt(0);
		
		
		//switch statement checking for value of myChar
		switch(myChar)
		{
		case 'g':
		case 'G':
			y++;
			break;
		case 'm':
		case 'M':
			y--;
			break;
		default:
			y += 100;
		}
		System.out.println("The value of y = " + y);

	}

}
