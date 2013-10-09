package demo.server;

import demo.client.shared.Payload;

import javax.enterprise.event.Observes;

public class ServerObserver {

  public void observer(@Observes Payload payload) {
    System.out.println("server observed payload");
  }
  
}
