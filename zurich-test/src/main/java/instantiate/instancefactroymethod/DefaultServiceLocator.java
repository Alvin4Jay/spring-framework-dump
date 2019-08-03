package instantiate.instancefactroymethod;

import instantiate.staticfactorymethod.ClientService;

public class DefaultServiceLocator {

	private static ClientService clientService = new ClientServiceImpl();

	public ClientService createClientServiceInstance() {
		return clientService;
	}
}