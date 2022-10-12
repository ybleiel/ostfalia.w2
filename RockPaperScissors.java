package s0start;

import java.util.Scanner;

public class RockPaperScissors
{

	public static void main(String[] args)
	{
		char pa, pb;
		Scanner sc = new Scanner(System.in);

		pa = sc.next().charAt(0);
		pb = sc.next().charAt(0);
		if (pa == 's' && pb == 'p')
			System.out.println("A gewinnt");
		else if (pa == 's' && pb == 'r')
			System.out.println("B gewinnt");
		else if (pa == 's' && pb == 's')
			System.out.println("Unentschieden");
		else if (pa == 'r' && pb == 's')
			System.out.println("A gewinnt");
		else if (pa == 'r' && pb == 'p')
			System.out.println("B gewinnt");
		else if (pa == 'r' && pb == 'r')
			System.out.println("Unentschieden");
		else if (pa == 'p' && pb == 's')
			System.out.println("B gewinnt");
		else if (pa == 'p' && pb == 'r')
			System.out.println("A gewinnt");
		else if (pa == 'p' && pb == 'p')
			System.out.println("Unentschieden");
		else if ((pa != 'p' || pa != 'r' || pa != 's') && (pb == 'p' || pb == 'r' || pb == 's'))
			System.out.println("A schummelt");
		else if ((pb != 'p' || pb != 'r' || pb != 's') && (pa == 'p' || pa == 'r' || pa == 's' ))
			System.out.println("B schummelt");
		else if ((pa != 'p' || pa != 'r' || pa != 's' ) && (pb != 'p' || pb != 'r' || pb != 's'))
			System.out.println("Beide schummeln");
		
		
		sc.close();
	}
}