package aop.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author xuanjian
 */
public class SystemArchitecture {

	@Pointcut("execution(* aop.service.*.*(..))")
	public void businessService() {

	}

}
