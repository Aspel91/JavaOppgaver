import javax.swing.JOptionPane;

public class MessageClass
{
	public void showMsg( String msg )
	{
		JOptionPane.showInputDialog(msg + "?");
		JOptionPane.showMessageDialog(null, msg);
	}
}