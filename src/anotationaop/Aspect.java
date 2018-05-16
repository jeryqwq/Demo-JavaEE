package anotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
	@Pointcut("execution(* anotationaop.UserDaoImpl.*(..))")
	private void myPointCut(){}
	@Before("myPointCut()")
public void myBefore(JoinPoint joinpoint){
	System.out.println("Check ing.....");
	System.out.println(joinpoint.getTarget());
	System.out.println(joinpoint.getSignature().getName());
}
	@AfterReturning("myPointCut()")
public void myAfterReturning(JoinPoint joinpoint){
	System.out.println("myAfterReturning ing....");
	System.out.println(joinpoint.getTarget());
	System.out.println(joinpoint.getSignature().getName());
}
@Around("myPointCut()")
public Object myAround(ProceedingJoinPoint proceedingJoinPoint )throws Throwable{
	System.out.println("myAround begin....");
	Object object=proceedingJoinPoint.proceed();
	System.out.println("myAround end....");
	return object;
	
}
@AfterThrowing(value="myPointCut()",throwing="e")
public void myAfterThrowing(JoinPoint joinpoint,Throwable e){
	System.out.println("myAfterThrowing ing....");
	System.out.println("errr"+e.getMessage());

}
@After("myPointCut()")
public void myAfter(){
	System.out.println("myAfter ing....");


}
}
