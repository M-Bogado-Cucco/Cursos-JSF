package devmedia_01_jsf;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	public ControlePrincipal() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagem = "Bem-vindo a primeira"
				+ " aplicação com JSF2, bean criado em " + 
				sdf.format(Calendar.getInstance().getTime());
	}
	
	public String sobre() {
		mensagem = "Você navegou de "
				+ "maneira dinâmica.";
		return "sobre";
	}
	
	//redirecionando e mudando a url/página
	public String sobreRedir() {
		mensagem = "Redir. para a página sobre.xhtml";
		return "sobre?faces-redirect=true";
	}
	
	public String geraErro(){
		return "errorPage?faces-redirect=true";				
	}
	
	public String geraErroGrave(){
		return "erroGrave?faces-redirect=true";
	}
	
	public String geraLogin(){
		return "loginPage?faces-redirect=true";
	}
	
	//getters e setters
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
