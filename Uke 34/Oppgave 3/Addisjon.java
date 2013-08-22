import javax.swing.JOptionPane;

public class Addisjon //Klassen
{
	public static void main( String[] args )
	{
		Object[] options = { "Heltall", "Desimaltall" }; // Alternativer for addisjon
		int selectedNum = JOptionPane.showOptionDialog(null, "Hvilken type tall vil du addere?", "Input",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); // Lager en optionDialog med verdiene fra options[]
		System.out.println(selectedNum); // DEBUG: printer ut valgt option i console

		/* Kjører metodene avhengig
		   av valgt option */
		if (selectedNum == 0) {
			heltall(); // Kjør heltallsregning
		}
		else {
			desimaltall(); // Kjør desimaltallsregning
		}
	}

	public static void heltall()
	{
		int num1; // Første tallet
		int num2; // Andre tallet

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Tast inn Tall 1")); // Be om tall 1 og lagre i num1
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Tast inn Tall 2")); // Be om tall 2 og lagre i num2
		JOptionPane.showMessageDialog(null, String.format("%d + %d = %d", num1, num2, num1 + num2)); // Print ut regnestykket og resultatet
	}

	public static void desimaltall()
	{
		double num1; // Første tallet
		double num2; // Andre tallet

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Tast inn Tall 1")); // Be om tall 1 og lagre i num1
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Tast inn Tall 2")); // Be om tall 2 og lagre i num2

		JOptionPane.showMessageDialog(null, String.format("%f + %f = %f", num1, num2, num1 + num2)); // Print ut regnestykket og resultatet
	}
} //End Addisjon