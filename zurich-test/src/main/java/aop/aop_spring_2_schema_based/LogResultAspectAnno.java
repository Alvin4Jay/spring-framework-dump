package aop.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author xuanjian
 */
@Aspect
public class LogResultAspectAnno {

	private boolean trace;

	@AfterReturning(value = "aop.aop_spring_2_schema_based.SystemArchitecture.businessService()", returning = "retValue")
	public void logResult(Object retValue) {
		if (trace) {
			System.out.println("[@AspectJ]返回值：" + retValue);
		}
	}

	public void setTrace(boolean trace) {
		this.trace = trace;
	}

}
