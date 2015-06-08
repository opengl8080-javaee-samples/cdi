package sample.cdi.bean.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import sample.cdi.bean.interceptor.OptionalIntercept;

@Stereotype
@RequestScoped
@OptionalIntercept
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyStereotype {
}
