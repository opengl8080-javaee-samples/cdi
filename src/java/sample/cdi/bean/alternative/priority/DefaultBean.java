package sample.cdi.bean.alternative.priority;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent @Alternative @Priority(10)
public class DefaultBean implements MyInterface{
}
