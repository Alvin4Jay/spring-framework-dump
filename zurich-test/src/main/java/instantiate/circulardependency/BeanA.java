package instantiate.circulardependency;

/**
 * class description here.
 *
 * @author xuanjian
 */
public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
