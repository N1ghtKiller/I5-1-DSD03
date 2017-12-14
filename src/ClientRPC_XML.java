import java.util.Vector;

import org.apache.xmlrpc.XmlRpcClient;

public class ClientRPC_XML {
	private XmlRpcClient xmlRpcClient;

	public int setValue(int value) {
		try {
			xmlRpcClient = new XmlRpcClient("http://localhost:8008");
			Vector<Integer> params = new Vector<>();
			params.addElement(value);
			Object result = xmlRpcClient.execute("sample.setValue", params);
			value = ((Integer) result).intValue();
		} catch (Exception e) {

		}
		return value;
	}

	public int sum() {
		int sum = 0;
		try {
			xmlRpcClient = new XmlRpcClient("http://localhost:8008");
			Vector<Integer> params = new Vector<>();
			Object result = xmlRpcClient.execute("sample.sum", params);
			sum = ((Integer) result).intValue();
		} catch (Exception e) {

		}
		return sum;
	}
}
