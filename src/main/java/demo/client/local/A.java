package demo.client.local;

import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.user.client.ui.Widget;

@EntryPoint
public class A extends Widget {
  
  @Inject B b;
  
  public A() {
    System.out.println("A object created");
    publicMethod();
  }
  
  public void publicMethod() {
    System.out.println("publicMethod called");
  }
  
}
