package demo.client.shared;

import org.jboss.errai.bus.server.annotations.Remote;

@Remote
public interface PayloadRPC {

  public void rpcCall(ServerPayload payload);
  
}
