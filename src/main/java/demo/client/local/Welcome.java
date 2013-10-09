package demo.client.local;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.security.shared.RequireRoles;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;

@Page(role=DefaultPage.class)
@Templated
@Dependent
public class Welcome extends Composite {

//  @RequireRoles("user")
  @Inject @DataField InlineLabel user;
  
  @RequireRoles("admin")
  @Inject @DataField InlineLabel admin;
  
}
