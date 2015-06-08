package sample.cdi.bean.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@MyIntercept
@Priority(10)
public class MyInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        
        System.out.println("before proceed");
        Object result = ic.proceed();
        System.out.println("after proceed");
        
        return result;
    }
}
