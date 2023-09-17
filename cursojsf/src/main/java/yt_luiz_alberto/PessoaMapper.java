package yt_luiz_alberto;

import java.util.ArrayList;
import java.util.List;

public class PessoaMapper {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public PessoaMapper() {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(1L);
		pessoa.setNome("Pessoa 1");
		pessoa.setEmail("p1@mail.com");
		
		adicionar(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void adicionar(Pessoa pessoa) {
		pessoa.setId(pessoas.size() + 1);
		
		pessoas.add(pessoa);
	}

}
