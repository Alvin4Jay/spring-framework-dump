package aop.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author xuanjian
 */
@Aspect
public class SystemArchitecture {

	@Pointcut("execution(* aop.service.*.*(..))")
	public void businessService() {

	}

}
