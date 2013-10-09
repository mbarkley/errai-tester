package demo.client.shared;

import javax.enterprise.context.Dependent;

import org.picketlink.idm.model.SimpleUser;
import org.picketlink.idm.model.User;

@Dependent
public class UserImpl extends SimpleUser implements User {

}
