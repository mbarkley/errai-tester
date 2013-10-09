package demo.client.shared;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.enterprise.context.Dependent;

import org.picketlink.idm.model.Attribute;
import org.picketlink.idm.model.Partition;
import org.picketlink.idm.model.User;

@Dependent
public class UserImpl implements User {
  
  @Override
  public String getLoginName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setLoginName(String loginName) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean isEnabled() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void setEnabled(boolean enabled) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Date getCreatedDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setCreatedDate(Date createdDate) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Date getExpirationDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setExpirationDate(Date expirationDate) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Partition getPartition() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setPartition(Partition partition) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getId() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setId(String id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setAttribute(Attribute<? extends Serializable> attribute) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void removeAttribute(String name) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <T extends Serializable> Attribute<T> getAttribute(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Collection<Attribute<? extends Serializable>> getAttributes() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getFirstName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setFirstName(String firstName) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getLastName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setLastName(String lastName) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getEmail() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setEmail(String email) {
    // TODO Auto-generated method stub
    
  }

}
