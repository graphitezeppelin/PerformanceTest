import java.util.*;
import java.io.*;

public class SomethingDoer {

    FileName _fileName;

    public SomethingDoer(FileName f) {
		
    }
    
    public void doIt(FileName f) {
		_fileName = f;

		ArrayList<String> strings = new ArrayList<String>();

		FileAccess fa = new FileAccess();
		
		strings = fa.readFile(f.name);

		DataCalculator dc = new DataCalculator();
		
		String[] arr2 = Arrays.asList(strings.toArray()).toArray(new String[strings.size()]);
		
		int[] calculated = dc.calculate((new StrategyOne()), arr2);

		int total = 0;
		for (int line : calculated) {
			total += line;
		}

		OutputControl oc = new OutputControl(System.out);
		oc.print("" + (total % 100));

    }
    
}
