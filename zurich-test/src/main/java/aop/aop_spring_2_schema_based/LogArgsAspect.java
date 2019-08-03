package aop.aop_spring_2_schema_based;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author xuanjian
 */
public class LogArgsAspect {

	private boolean trace = true;

	public void logArgs(JoinPoint joinPoint) {
		if (trace) {
			System.out.println("[@AspectJ]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
		}
	}

	public void setTrace(boolean trace) {
		this.trace = trace;
	}
}
