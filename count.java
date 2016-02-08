import javax.swing.*; //import swing library
class count
{
	private static int count = 0;
	
	public static void main (String [] args)
	{
		String answer = JOptionPane.showInputDialog("Would you like to count?");
		
		while (answer.equalsIgnoreCase("yes")) {
			
			count += 1;
			System.out.println(count);
			answer = JOptionPane.showInputDialog("Would you like to count?");
		}
		System.exit(0);
	}
}