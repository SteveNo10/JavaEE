package logon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LogonAction extends DispatchAction {
	@Override  
    public ActionForward execute(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
  
        LogonForm logonform =(LogonForm)form;  
        if(logonform.getUsername().trim().length()>0 && logonform.getPassword().trim().length()>0){  
            return mapping.findForward("LogonSuccess");   
        }  
        return mapping.findForward("LogonFailure");  
          
    }  
}
