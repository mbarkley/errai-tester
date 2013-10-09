package demo.client.shared;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.security.shared.AuthenticationService;
import org.jboss.errai.security.shared.Role;
import org.jboss.errai.security.shared.User;
import org.jboss.errai.ui.nav.client.shared.PageRequest;

@ApplicationScoped
public class AuthServiceImpl implements AuthenticationService {

  @Override
  public User login(String username, String password) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isLoggedIn() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void logout() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public User getUser() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Role> getRoles() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasPermission(PageRequest pageRequest) {
    // TODO Auto-generated method stub
    return false;
  }

}
