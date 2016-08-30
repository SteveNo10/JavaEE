package logon;

import org.apache.struts.action.ActionForm;

public class LogonForm extends ActionForm {
	private static final long serialVersionUID = -3420028016884449043L;
	
	private String username;  
    private String password;  
    private String logonstatus;  
      
      
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String getLogonstatus() {  
        return logonstatus;  
    }  
    public void setLogonstatus(String logonstatus) {  
        this.logonstatus = logonstatus;  
    }  
}
