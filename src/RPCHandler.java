
public class RPCHandler {
	
	private static int a = 0;
	private static int b = 0;

	public int setValue(int value) {
		if(a == 0){
			a = value;
			System.out.println(a);
		} else if(a != 0 && b == 0){
			b = value;
		}
		return value;
	}

	public Integer sum() {
		int temp = a + b;
		a = 0;
		b = 0;
		return new Integer(temp);
	}

}
