package hu.ulyssys.java.course.maven.ejb;
import javax.ejb.Stateless;
@Stateless
public class DemoStatelessBean {

    public void doSomething(){
        System.out.println("Lefutott a bean");
    }
}