package sample.cdi.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.cdi.ejb.AlternativeEjb;
import sample.cdi.ejb.DecoratorEjb;
import sample.cdi.ejb.DefaultAnyEjb;
import sample.cdi.ejb.EventEjb;
import sample.cdi.ejb.HelloEjb;
import sample.cdi.ejb.InjectionPointEjb;
import sample.cdi.ejb.InstanceEjb;
import sample.cdi.ejb.InterceptorEjb;
import sample.cdi.ejb.LifeCycleCallbackMethodEjb;
import sample.cdi.ejb.MetadataEjb;
import sample.cdi.ejb.NamedEjb;
import sample.cdi.ejb.NewQualifierEjb;
import sample.cdi.ejb.PriorityEjb;
import sample.cdi.ejb.ProducerEjb;
import sample.cdi.ejb.QualifierAttributeEjb;
import sample.cdi.ejb.QualifierEjb;
import sample.cdi.ejb.ScopeEjb;
import sample.cdi.ejb.SpecializeEjb;
import sample.cdi.ejb.StereotypeEjb;

@WebServlet("/*")
public class ControlServlet extends HttpServlet {
    
    @Inject private HelloEjb hello;
    @Inject private InjectionPointEjb injectionPoint;
    @Inject private ScopeEjb scopeEjb;
    @Inject private LifeCycleCallbackMethodEjb lifeCycleCallbackMethodEjb;
    @Inject private ProducerEjb producerEjb;
    @Inject private QualifierEjb qualifierEjb;
    @Inject private QualifierAttributeEjb qualifierAttributeEjb;
    @Inject private NamedEjb namedEjb;
    @Inject private DefaultAnyEjb defaultAnyEjb;
    @Inject private NewQualifierEjb newQualifierEjb;
    @Inject private MetadataEjb metadataEjb;
    @Inject private InstanceEjb instanceEjb;
    @Inject private AlternativeEjb alternativeEjb;
    @Inject private PriorityEjb priorityEjb;
    @Inject private SpecializeEjb specializeEjb;
    @Inject private InterceptorEjb interceptorEjb;
    @Inject private StereotypeEjb stereotypeEjb;
    @Inject private DecoratorEjb decoratorEjb;
    @Inject private EventEjb eventEjb;
    
    private Map<String, Object> ejbStore = new HashMap<>();

    @Override
    public void init() throws ServletException {
        this.ejbStore.put("hello", this.hello);
        this.ejbStore.put("injection-point", this.injectionPoint);
        this.ejbStore.put("scope", this.scopeEjb);
        this.ejbStore.put("callback", this.lifeCycleCallbackMethodEjb);
        this.ejbStore.put("producer", this.producerEjb);
        this.ejbStore.put("qualifier", this.qualifierEjb);
        this.ejbStore.put("qualifier-attribute", this.qualifierAttributeEjb);
        this.ejbStore.put("named", this.namedEjb);
        this.ejbStore.put("defaultany", this.defaultAnyEjb);
        this.ejbStore.put("new", this.newQualifierEjb);
        this.ejbStore.put("metadata", this.metadataEjb);
        this.ejbStore.put("instance", this.instanceEjb);
        this.ejbStore.put("alternative", this.alternativeEjb);
        this.ejbStore.put("priority", this.priorityEjb);
        this.ejbStore.put("specialize", this.specializeEjb);
        this.ejbStore.put("interceptor", this.interceptorEjb);
        this.ejbStore.put("stereotype", this.stereotypeEjb);
        this.ejbStore.put("decorator", this.decoratorEjb);
        this.ejbStore.put("event", this.eventEjb);
        System.out.println("ejb store initialized.");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Path path = new Path(req.getPathInfo());
        System.out.println(path);
        
        Object ejb = this.ejbStore.get(path.getEjbName());
        
        if (ejb == null) {
            throw new IllegalArgumentException("ejb が存在しません。 ejb name = " + path.getEjbName());
        }
        
        try {
            Method method = ejb.getClass().getMethod(path.getMethodName());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            method.invoke(ejb);
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        } catch (NoSuchMethodException ex) {
            throw new IllegalArgumentException("メソッドが ejb に定義されていません。 method name = " + path.getMethodName(), ex);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static class Path {
        private String pathInfo;
        private String[] pathes;
        
        private Path(String pathInfo) {
            this.pathInfo = pathInfo;
            this.pathes = pathInfo.split("/");
        }
        
        private String getEjbName() {
            return this.pathes[1];
        }
        
        private String getMethodName() {
            return this.pathes.length == 3 ? this.pathes[2] : "execute";
        }

        @Override
        public String toString() {
            return "Path{ejbName=" + this.getEjbName() + ", methodName=" + this.getMethodName() + "}";
        }
    }
}
