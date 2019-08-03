package aop.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author xuanjian
 */
@Aspect
public class LogResultAspect {

	private boolean trace;

	@AfterReturning(value = "aop.aop_spring_2_aspectj.SystemArchitecture.businessService()", returning = "retValue")
	public void logResult(Object retValue) {
		if (trace) {
			System.out.println("[@AspectJ]返回值：" + retValue);
		}
	}

	public void setTrace(boolean trace) {
		this.trace = trace;
	}

}
