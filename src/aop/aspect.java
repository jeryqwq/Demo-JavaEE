package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class aspect {
public void myBefore(JoinPoint joinpoint){
	System.out.println("Check ing.....");
	System.out.println(joinpoint.getTarget());
	System.out.println(joinpoint.getSignature().getName());
}
public void myAfterReturning(JoinPoint joinpoint){
	System.out.println("myAfterReturning ing....");
	System.out.println(joinpoint.getTarget());
	System.out.println(joinpoint.getSignature().getName());
}

public Object myAround(ProceedingJoinPoint proceedingJoinPoint )throws Throwable{
	System.out.println("myAround begin....");
	Object object=proceedingJoinPoint.proceed();
	System.out.println("myAround end....");
	return object;
}
public void myAfterThrowing(JoinPoint joinpoint,Throwable e){
	System.out.println("myAfterThrowing ing....");
	System.out.println("errr"+e.getMessage());

}
public void myAfter(){
	System.out.println("myAfter ing....");


}
}
