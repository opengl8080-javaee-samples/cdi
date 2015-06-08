package sample.cdi.bean.qualifier.attribute;

import javax.enterprise.context.Dependent;

@Dependent @MyQualifier
public class Hoge implements MyInterface {
}
