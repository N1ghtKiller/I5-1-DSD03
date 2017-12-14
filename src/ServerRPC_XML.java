import org.apache.xmlrpc.WebServer;

public class ServerRPC_XML {

	public static void main(String[] args) {
		try {
			WebServer server = new WebServer(8008);
			server.addHandler("sample", new RPCHandler());
			server.start();
			System.out.println("Server running!");
		} catch (Exception exception) {
			System.err.println("JavaServer: " + exception);
		}
	}

}
