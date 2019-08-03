package aop.aop_spring_2_schema_based;

/**
 * @author xuanjian
 */
public class LogResultAspect {

	private boolean trace;

	public void logResult(Object retValue) {
		if (trace) {
			System.out.println("[@AspectJ]返回值：" + retValue);
		}
	}

	public void setTrace(boolean trace) {
		this.trace = trace;
	}

}
