package aop.aop_spring_2_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * @author xuanjian
 */
@Aspect
public class LogArgsAspect {

	private boolean trace = true;

	@Before("aop.aop_spring_2_aspectj.SystemArchitecture.businessService()")
	public void logArgs(JoinPoint joinPoint) {
		if (trace) {
			System.out.println("[@AspectJ]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
		}
	}

	public void setTrace(boolean trace) {
		this.trace = trace;
	}
}
