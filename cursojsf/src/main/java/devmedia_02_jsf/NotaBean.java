package devmedia_02_jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class NotaBean {

	private ArrayList<Nota> notas = new ArrayList<Nota>() {

		private static final long serialVersionUID = 1L;

		{
			add(new Nota(1L, "Comprar leite", "11h, antes de ir trabalhar"));
			add(new Nota(2L, "Veterinário", "9h, levar o gato no veterinário"));
			add(new Nota(3L, "Prova", "3/5 11h, marcar prova"));
			add(new Nota(4L, "Comprar passagens", "11/5 8h30"));
		}
	};

	private Nota nota = new Nota();

	public Nota getNota() {
		return nota;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void salvar() {
		notas.add(nota);
		nota = new Nota(); /* limpa os dados do formulário */

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Lembrete incluído com sucesso!"));
	}
}
