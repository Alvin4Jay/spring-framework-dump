package instantiate.staticfactorymethod;

/**
 * Static Factory Method
 *
 * @author xuanjian
 */
public class ClientService {
	private static ClientService clientService = new ClientService();

	public ClientService() {
	}

	public static ClientService createInstance() {
		return clientService;
	}
}
