package br.com.triadworks.issuetracker.security;

import javax.inject.Inject;
import javax.interceptor.Interceptor;

import org.conventionsframework.qualifier.SecurityMethod;
import org.conventionsframework.security.SecurityMethodInterceptor;

import br.com.triadworks.issuetracker.qualifier.UserRole;

 

@Interceptor
@SecurityMethod  
public class IssueTrackerSecurityInterceptor extends SecurityMethodInterceptor{  
  
	@Inject @UserRole
	private String currentRole;
    /**  
     * this method is responsible for deciding if current user has permition   
     * to execute a method  
     *   
     * @param rolesAllowed roles passed in the method  
     * @return true if user has permition, false otherwise  
     */  
	@Override  
    @SuppressWarnings("unchecked")
    public boolean checkUserPermissions(String[] rolesAllowed) {  
        //user role(s) should be extracted from current logged user  
        if(currentRole == null || "".endsWith(currentRole)){  
            return false;  
        }  
        for (String role : rolesAllowed) {  
            if(currentRole.equals(role)){  
                return true;  
            }  
        }  
        return false;  
    }  
      
}  