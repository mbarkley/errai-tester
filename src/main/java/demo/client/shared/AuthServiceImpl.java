package demo.client.shared;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.security.server.PicketLinkAuthenticationService;
import org.jboss.errai.security.shared.AuthenticationService;

@ApplicationScoped
public class AuthServiceImpl extends PicketLinkAuthenticationService implements AuthenticationService {

}
