package demo.client.local;

import javax.enterprise.event.Observes;

import demo.client.shared.Payload;

public class ClientObserver {

  public void observer(@Observes Payload payload) {
    System.out.println("client observer payload");
  }
  
}
