package instantiate.circulardependency;

/**
 * class description here.
 *
 * @author xuanjian
 */
public class BeanB {

	private BeanA beanA;

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}
}