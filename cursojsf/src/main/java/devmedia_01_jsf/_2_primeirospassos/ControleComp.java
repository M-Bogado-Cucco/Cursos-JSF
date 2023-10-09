package devmedia_01_jsf._2_primeirospassos;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

@ManagedBean(name="controleComponentes")
@SessionScoped
public class ControleComp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String texto;
	private String idComponente;
	
	
	
	public ControleComp() {
	}
	
	//compomente2
	public String geraTexto() {
		texto = "Texto gerado: < > & <b>Texto em negrito</b>";
		return "compPart2";
	}
	
	//componente3
	public void listener(ActionEvent event) {
		UIComponent source = event.getComponent();
		idComponente = source.getId();
	}
	
	
	
	
	// getters e setters
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	

}














