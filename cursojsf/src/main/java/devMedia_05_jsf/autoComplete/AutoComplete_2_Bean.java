package devMedia_05_jsf.autoComplete;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="autoCompleteBean2")
@SessionScoped
public class AutoComplete_2_Bean {
	
	List<String> contatos;
	
	public AutoComplete_2_Bean() {
		
		contatos = new ArrayList<String>();
		
		contatos.add("wesley@devmedia.com.br");
		contatos.add("alberto@devmedia.com.br");
		contatos.add("joao@devmedia.com.br");
		contatos.add("luciano@devmedia.com.br");
		contatos.add("marta@devmedia.com.br");
		contatos.add("mballey@devmedia.com.br");
	}
	
	//método para buscar pela lista de contatos
	public List<String> complete(String busca) {
		List<String> resultados = new ArrayList<String>();
		for (String contato : contatos) {
			if (contato.toUpperCase().contains(busca.toUpperCase())) {
				resultados.add(contato);
			}
		}
		return resultados;
	}
	
	private List<String> contatosSelecionados;
	
	
	public List<String> getContatosSelecionados() {
		return contatosSelecionados;
	}
	
	public void setContatosSelecionados(List<String> contatosSelecionados) {
		this.contatosSelecionados = contatosSelecionados;
	}
	
	
}





























