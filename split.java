class split
{
	public static void main (String [] emails)
	{
		String text = "";
		String[] all = new String[(emails.length*3)];
		
		//put all input into 1 string
		for (int i = 0; i < emails.length; i++ )
		{
			text += (emails[i] + " ");
		}
		
		//in String text replace all "@" and "." into " "
		text = text.replaceAll("\\@", " ");
		text = text.replaceAll("\\.", " ");
		
		//put all into 1 array
		all = text.split(" ");
				
		//separate into correct arrays
		for (int j = 0; j < all.length; j=j+3)
		{
			System.out.println("name is " + all[j] + "\t domain1 is " + all[j+1] + "\t domain2 is " + all[j+2]);
		}
		
		System.exit(0);
	}
	
}

