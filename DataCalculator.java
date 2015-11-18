import java.util.*;

public class DataCalculator {

    
    public DataCalculator() {
    }
    
    public int[] calculate(StrategyInterface strategy, String[] strings) {
		int[] toReturn = new int[strings.length];
		for (int j = 0; j < strings.length; j++) {
			int calced = strategy.calculate(strings[j]);
			toReturn[j] = calced;
		}

	return toReturn;
    }
    
}
