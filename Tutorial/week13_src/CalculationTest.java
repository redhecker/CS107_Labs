package lab13;

import javax.swing.JFrame;

public class CalculationTest 
{
   public static void main( String[] args )
   { 
	   Calculation calculationFrame = new Calculation();
	   calculationFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   calculationFrame.setLocationRelativeTo(null);
	   calculationFrame.pack(); // set frame size
	   calculationFrame.setVisible( true ); // display frame
   }
}

