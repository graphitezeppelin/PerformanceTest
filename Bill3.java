import java.util.*;
import java.io.*;

public class Bill3 {

    public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));
		 String line = null;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
		 }

	
    }
    
}
