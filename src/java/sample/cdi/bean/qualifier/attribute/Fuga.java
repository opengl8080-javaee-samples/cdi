package sample.cdi.bean.qualifier.attribute;

import javax.enterprise.context.Dependent;

@Dependent @MyQualifier(MyBeanType.FUGA)
public class Fuga implements MyInterface {
}
