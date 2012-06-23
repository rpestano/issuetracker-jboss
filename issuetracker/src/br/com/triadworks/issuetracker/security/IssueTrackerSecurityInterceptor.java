package br.com.triadworks.issuetracker.security;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.interceptor.Interceptor;

import com.jsf.conventions.interceptor.AbstractSecurityMethodInterceptor;
import com.jsf.conventions.qualifier.SecurityMethod;

 

@Interceptor
@SecurityMethod  
public class IssueTrackerSecurityInterceptor extends AbstractSecurityMethodInterceptor{  
  
    /**  
     * this method is responsible for deciding if current user has permition   
     * to execute a method  
     *   
     * @param rolesAllowed roles passed in the method  
     * @return true if user has permition, false otherwise  
     */  
    @Override  
    public boolean checkUserPermissions(String[] rolesAllowed) {  
        //user role(s) should be extracted from current logged user  
        //we just put the role in the session for testing purposes  
        List<String> userRoles = (List<String>) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userRoles");  
        if(userRoles == null || userRoles.isEmpty()){  
            return false;  
        }  
        for (String role : rolesAllowed) {  
            if(userRoles.contains(role)){  
                return true;  
            }  
        }  
        return false;  
    }  
      
}  