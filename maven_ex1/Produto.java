package ex1jpamaven;

public class Produto {
	private Integer cod;
	private String nome;
	private Integer categoria;

	public Produto(Integer cod, 
			      String nome, 
			      Integer categoria) {
		this.cod = cod;
		this.nome = nome;
		this.categoria = categoria;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Produto[cod=" +cod +", nome=" +nome + ", categoria=" +categoria +"]";
	}
	
}
