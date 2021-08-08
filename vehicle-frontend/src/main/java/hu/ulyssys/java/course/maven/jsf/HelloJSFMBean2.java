package hu.ulyssys.java.course.maven.jsf;


import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class HelloJSFMBean2 implements Serializable {

    private String value = "KAPPA";
    public String getValue() {
        return value;
    }
}
