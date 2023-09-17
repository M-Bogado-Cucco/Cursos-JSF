package devMedia_05_jsf._7_dados;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="carouselBean")
@SessionScoped
public class CarouselBean {
	
	List<ProdutoBean> produtos;
	
	ProdutoBean produtoSelecionado;
	
	// construtor
	public CarouselBean(){
		produtos = new ArrayList<ProdutoBean>();
		
		produtos.add(new ProdutoBean("PS3", 999, 250));
		produtos.add(new ProdutoBean("XBOX", 799, 190));
		produtos.add(new ProdutoBean("WII", 699, 150));
		produtos.add(new ProdutoBean("iPhone 4S", 1699, 350));
		produtos.add(new ProdutoBean("Galaxy S3", 2199, 262));
		produtos.add(new ProdutoBean("iPad 3", 1799, 290));
		
	}
	
	//getter
	public List<ProdutoBean> getProdutos() {
		return produtos;
	}

	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(ProdutoBean produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	
}














