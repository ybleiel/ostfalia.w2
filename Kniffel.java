package s0start;

import java.util.Scanner;

public class Kniffel
{

	public static void main(String[] args)
	{
		int a, b, c, d, f;
		int zahl[], i, j, n;
		int summe;
		boolean kniffel, pasch, gerade, ungerade, fullhouse;
		Scanner sc = new Scanner(System.in);
		
		zahl = new int[50];
		i = 0;
		while (i < 5)
		{
			zahl[i] = sc.nextInt();
			i++;
		}
		a = zahl[0];
		b = zahl[1];
		c = zahl[2];
		d = zahl[3];
		f = zahl[4];
		summe = a + b + c + d + f;
		System.out.println("Summe = " + summe);
		if (a == b && a == c && a == d && a == f)
			kniffel = true;
		else
			kniffel = false; 
		System.out.println("Kniffel = " + kniffel);
		if (a == b || a == c || a == d || a == f || b == c || b == d || b == f || c == d || c == f
				|| d == f)
			pasch = true;
		else
			pasch = false;
		System.out.println("Pasch = " + pasch);
		if ((a == 2 || a == 4 || a == 6) && (b == 2 || b == 4 || b == 6) && (c == 2 || c == 4 || c == 6)
				&& (d == 2 || d == 4 || d == 6) && (f == 2 || f == 4 || f == 6))
			gerade = true;
		else
			gerade = false;
		System.out.println("Gerade = " + gerade);
		if ((a == 1 || a == 3 || a == 5) && (b == 1 || b == 3 || b == 5) && (c == 1 || c == 3 || c == 5)
				&& (d == 1 || d == 3 || d == 5) && (f == 1 || f == 3 || f == 5))
			ungerade = true;
		else
			ungerade = false;
		System.out.println("Ungerade = " + ungerade);
		i = 0;
		j = 0;
		n = 0;
		while (i < 5)
		{
			while (j < 5)
			{
				if (zahl[i] == zahl [j] && i != j)
					n++;
				j++;
			}
			i++;
			j = 0;
		}
		if (n == 8)
			fullhouse = true;
		else
			fullhouse = false;
		System.out.println("FullHouse = " + fullhouse);
		sc.close();
	}
}