package p4.bd2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quarto {
	@Id
	private Integer numero;
	@Id
	private Integer andar;
	@Column(name = "predioQuarto")
	private String predio;
	@Column(name = "precoQuarto")
	private float preco;
	@Column(name = "camaoQuarto")
	private String cama;
	@Column(name = "tipoQuarto")
	private String tipo;
	@Column(name = "capacidadeQuarto")
	private Integer capacidade;
	@Column(name = "disponibilidadeQuarto")
	private boolean disponibilidade;

	public Quarto() {

	}

	public Quarto(Integer numero, Integer andar, String predio, float preco, String cama, String tipo,
			Integer capacidade, boolean disponibilidade) {
		super();
		this.numero = numero;
		this.andar = andar;
		this.predio = predio;
		this.preco = preco;
		this.cama = cama;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.disponibilidade = disponibilidade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public String getPredio() {
		return predio;
	}

	public void setPredio(String predio) {
		this.predio = predio;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCama() {
		return cama;
	}

	public void setCama(String cama) {
		this.cama = cama;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Quarto [numero=" + numero + ", andar=" + andar + ", predio=" + predio + ", preco=" + preco + ", cama="
				+ cama + ", tipo=" + tipo + ", capacidade=" + capacidade + ", disponibilidade=" + disponibilidade + "]";
	}
	

	
}
