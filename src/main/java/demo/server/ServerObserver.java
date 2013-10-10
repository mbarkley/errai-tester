package demo.server;

import demo.client.shared.ClientPayload;
import demo.client.shared.GlobalPayload;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class ServerObserver {

  public void localObserver(@Observes ClientPayload payload) {
    System.out.println("server observed payload");
  }
  
  public void globalObserver(@Observes GlobalPayload payload) {
    
  }
  
}
