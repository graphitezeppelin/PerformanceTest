public class StrategyOne implements StrategyInterface {

    public int calculate(String s) {
	int toReturn = 0;
	int length = s.length;
	for (int j = 0; j < length; j++) {
	    System.out.print(".");
	    toReturn += (byte) s.charAt(j);
	}
	toReturn += ( BillUtil.value() * length );
	System.out.println("... done!");
	if (s.length() == 0) {
	    return 0;
	} else {
	    return toReturn % s.length();
	}
    }
    
}
