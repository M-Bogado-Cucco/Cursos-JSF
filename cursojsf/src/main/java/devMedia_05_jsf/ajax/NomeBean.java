package devMedia_05_jsf.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "nomeBean")
@RequestScoped /* bean instanciado a cada requisição */
public class NomeBean {
	
	private String nome;
	
	
	// geters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
























