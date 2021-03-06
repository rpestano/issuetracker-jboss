package br.com.triadworks.issuetracker.controller.dashboard;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;
import org.conventionsframework.bean.BaseMBean;
import org.conventionsframework.qualifier.Service;

import br.com.triadworks.issuetracker.controller.UsuarioWeb;
import br.com.triadworks.issuetracker.model.Issue;

@Named
@ViewAccessScoped
@Service(name="issueService")
public class DashboardBean extends BaseMBean<Issue> implements Serializable{

	
	private UsuarioWeb usuarioWeb;
	
	public DashboardBean() {
		 
	}

	@Inject
	public DashboardBean(UsuarioWeb usuarioWeb) {
		this.usuarioWeb = usuarioWeb;
	}
	
	/**
	 * coloca id do usuario no mapa para issueService acessar posteriormente
	 * quando for configurar a paginação(configFindPaginated)
	 */
	@PostConstruct
	public void preload() {
		Long id = usuarioWeb.getUsuario().getId();
		getPaginator().getFilter().put("uID", id);//passa id do usuário logado para carregar as suas issues na issueService e mostrar no dashboard
	}
	
}
