package sample.cdi.bean.alternative.priority.specialize;

import javax.enterprise.context.Dependent;

@Dependent @MyQualifier
public class QualifiedBean implements MyInterface {
}
