package demo.server;

import org.jboss.errai.bus.server.annotations.Service;

import demo.client.shared.PayloadRPC;
import demo.client.shared.ServerPayload;

@Service
public class PayloadRPCImpl implements PayloadRPC {

  @Override
  public void rpcCall(ServerPayload payload) {

  }

}
