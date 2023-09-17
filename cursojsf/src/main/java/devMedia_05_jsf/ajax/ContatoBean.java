package devMedia_05_jsf.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="contatoBean")
@SessionScoped // se eu usar aqui RequestScoped, ele vai sobrescrever o registro atual
public class ContatoBean {
		
	private Contato contato;
	private List<Contato> contatos;
	
	public ContatoBean(){
		contato = new Contato();
		contatos = new ArrayList<Contato>();
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void InserirContato(){
		
		if(contato.nome.equals("") || contato.cidade.equals("")) {
			FacesMessage msg = new FacesMessage(
					"Algum campo está vazio",
					"Preencha os campos para inserir o contato"
					);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		else if(contatos.contains(contato) && !contato.nome.equals("")){
			FacesMessage msg = new FacesMessage(
					"Registro Duplicado",
					"O contato que você está inserindo já existe");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		else{
			contatos.add(contato);		
			contato = new Contato();	
		}			
	}
	
	
}
