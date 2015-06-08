package sample.cdi.bean.alternative.beansxml;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

@Dependent @Alternative
public class TestBean implements MyInterface {
}
