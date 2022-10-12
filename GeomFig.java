package s0start;

import java.awt.Color;
import java.util.Scanner;

import std.ui.MiniApp;

public class GeomFig extends MiniApp
{
   public static void main(String[] args)
   {
	  int A, k, q, p, offset;
	  Scanner keyboard = new Scanner(System.in);

	  A = keyboard.nextInt();
	  q = (int) Math.sqrt(A);
	  p = (int) Math.sqrt(A + ((q / 2) * (q / 2)));
	  k = (int) Math.sqrt(A / Math.PI);
	  offset = q / 2;
      fillCircle("Kreis", 75, 100, k, Color.RED);
      fillRectangle("Quadrat", 150 - offset, 100 - offset, q, q, Color.GREEN);
      fillRectangle("Platte", 225 - (p / 2), 100 - (p / 2), p, p, Color.BLUE);
      fillCircle("Bohrung", 225, 100, (p / 2) / 2, Color.WHITE);
      
      keyboard.close();
   }
}
