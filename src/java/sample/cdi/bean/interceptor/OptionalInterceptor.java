package sample.cdi.bean.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@OptionalIntercept(true)
@Priority(100)
public class OptionalInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        
        System.out.println("[OptionalInterceptor] before proceed");
        Object result = ic.proceed();
        System.out.println("[OptionalInterceptor] after proceed");
        
        return result;
    }
}
