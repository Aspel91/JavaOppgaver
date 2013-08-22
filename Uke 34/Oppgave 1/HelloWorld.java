import javax.swing.JOptionPane;

public class HelloWorld
{
	public static void main( String[] args )
	{
		String fname = JOptionPane.showInputDialog( "What's your first name?" );
		String lname = JOptionPane.showInputDialog( "What's your last name?" );

		JOptionPane.showMessageDialog( null, String.format("Hey there, %s %s!", fname, lname));
	}
}