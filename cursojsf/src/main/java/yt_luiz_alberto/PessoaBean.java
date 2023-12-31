package yt_luiz_alberto;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class PessoaBean {

	private Pessoa pessoa;
	private PessoaMapper mapper = new PessoaMapper();

	@PostConstruct
	public void init() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	
	public List<Pessoa> getPessoas() {
		return mapper.getPessoas();
	}
	
	public String adicionar() {
		mapper.adicionar(pessoa);
		pessoa = new Pessoa();
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, 
				new FacesMessage("Pessoa adicionada com sucesso"));
		
		context.getExternalContext().
			getFlash().setKeepMessages(true);
		
		return "index-1.xhtml?faces-redirect=true";
	}

}














