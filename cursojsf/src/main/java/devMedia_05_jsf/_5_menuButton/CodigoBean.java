package devMedia_05_jsf._5_menuButton;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="codigoBean")
@RequestScoped
public class CodigoBean {
	
	
	private String codEnvio;
	
	
	// getters e setters
	public String getCodEnvio() {
		return codEnvio;
	}

	public void setCodEnvio(String codEnvio) {
		this.codEnvio = codEnvio;
	}
}
