import java.io.*;
import java.util.*;

public class ArrayListReader {

    public void findPassw(String fName, String pname, String pwd) 
    {
        System.out.println("Test");
        String line;
        ArrayList<String> lines = new ArrayList<String>();
		boolean found = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fName)); 
            while ((line = br.readLine()) != null) //while line in file isn't empty, continue reading file
    		{
    		      lines.add(line.split(" ")[0]);
    		      lines.add(line.split(" ")[1]);
    		}
    		br.close();
        }//END try
        
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
		catch (IOException e) {
			System.out.println("IOException");
		}
            
		for (int i=0; i<(lines.size()); i++) {
    		    if ((lines.get(i)).equals(pname)) {
    		        found = true;
    		        if ((lines.get(i+1)).equals(pwd)) {
    		            System.out.println(pname + " OK");
    		         }
    		        else {
    		            System.out.println(pname + " DENIED");
    		         }//END if checking correct pwd
    		     }//END if searching for pname
    		  }//END for loop
		
    		
    	if (found = false){
    		    System.out.println("No such name");
    		 }
    		 

		


    }
}
