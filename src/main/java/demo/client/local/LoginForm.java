package demo.client.local;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.bus.client.api.BusErrorCallback;
import org.jboss.errai.bus.client.api.messaging.Message;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.security.client.local.Identity;
import org.jboss.errai.security.shared.LoginPage;
import org.jboss.errai.security.shared.User;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Model;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;

@Page(role = LoginPage.class)
@Templated("#root")
@Dependent
public class LoginForm extends Composite {
  
  @Inject
  TransitionTo<Welcome> goToWelcome;
  
  @Inject
  @Model
  Identity identity;

  @Inject
  @Bound
  @DataField
  private TextBox username;

  @Inject
  @Bound
  @DataField
  private PasswordTextBox password;

  @Inject
  @DataField
  private Button login;

  @EventHandler("login")
  private void loginClicked(ClickEvent event) {
    System.out.println("button clicked");
    identity.login(new RemoteCallback<User>() {
      @Override
      public void callback(User response) {
        System.out.println("logged in as user: " + response.getLoginName());
        goToWelcome.go();
      }
    }, new BusErrorCallback() {
      @Override
      public boolean error(Message message, Throwable throwable) {
        System.out.println(message);
        return true;
      }
    });
  }
}
