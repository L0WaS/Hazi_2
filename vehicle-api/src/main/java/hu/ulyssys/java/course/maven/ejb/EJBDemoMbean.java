package hu.ulyssys.java.course.maven.ejb;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
@Named
@ViewScoped
public class EJBDemoMbean implements Serializable {

    private String name;
    @EJB
    private DemoStatelessBean statelessBean;
    @PostConstruct
    private void init() {
        statelessBean.doSomething();
        name = "Hello world";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}