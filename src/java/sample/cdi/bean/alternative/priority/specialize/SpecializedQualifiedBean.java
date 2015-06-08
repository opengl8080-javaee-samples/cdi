package sample.cdi.bean.alternative.priority.specialize;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;

@Dependent @Alternative @Priority(10) @Specializes @MyQualifier @MyQualifier2
public class SpecializedQualifiedBean extends DefaultBean {
}
