package br.com.tidicas.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.tidicas.bean.Index;
import br.com.tidicas.bean.impl.IndexImpl;

/**
 * Classe controller principal
 * @author Evaldo Junior
 *
 */
@ManagedBean
@ViewScoped
public class MainBean {
	
	public final String pagina = "Página Inicial";
	
	public Index getIndex() {
		Index index = new IndexImpl();
		index.setMensagem(pagina);
		return index;
	}

	public void menuAction(ActionEvent event){
        
        try {
			FacesContext.getCurrentInstance().
			getExternalContext().redirect("/richfaces/index.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}