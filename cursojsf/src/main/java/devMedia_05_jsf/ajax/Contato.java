package devMedia_05_jsf.ajax;

public class Contato {
	protected String nome;
	protected String cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public boolean equals(Object contato) {
		Contato contatoCast = (Contato) contato;
		if (this.getNome().equals(contatoCast.getNome())) {
			return true;
		}
		return false;
	}
}
