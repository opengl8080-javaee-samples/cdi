package sample.cdi.bean.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@MyIntercept
@Priority(11)
public class MyInterceptor2 {

    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        
        System.out.println("before proceed 2");
        Object result = ic.proceed();
        System.out.println("after proceed 2");
        
        return result;
    }
}
