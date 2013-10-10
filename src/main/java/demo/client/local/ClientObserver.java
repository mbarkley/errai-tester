package demo.client.local;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import demo.client.shared.ClientPayload;
import demo.client.shared.GlobalPayload;

@ApplicationScoped
public class ClientObserver {

  public void localObserver(@Observes ClientPayload payload) {
    System.out.println("client observer local payload");
  }
  
  public void globalObserver(@Observes GlobalPayload payload) {
    
  }
  
}
