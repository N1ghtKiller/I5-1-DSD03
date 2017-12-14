
public class DemoRPC_XML {

	public static void main(String[] args) {
		ClientRPC_XML clientA = new ClientRPC_XML();
		ClientRPC_XML clientB = new ClientRPC_XML();
		
		clientA.setValue(10);
		clientB.setValue(7);
		System.out.println("Sum: " + clientA.sum());
	}

}
