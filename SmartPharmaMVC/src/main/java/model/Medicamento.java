package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicamentos")
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "nome_medicamento", length = 155)
	protected String nomeMedicamento;
	
	@Column(name = "preco", length = 10)
	public float preco;
	
	@Column(name = "quantidade_estoque", length = 10)
	protected int quantidadeEstoque;
	
	@Column(name = "componente", length = 155)
	protected String componente;
	
	@Column(name = "laboratorio", length = 10)
	protected Laboratorio laboratorio;
	
	@Column(name = "lote", length = 10)
	protected int lote;
	
	@Column(name = "validade", length = 12, nullable = false)
	protected String validade;
	
	public Medicamento(int id, String nomeMedicamento, float preco) {
		this.id = id;
		this.nomeMedicamento = nomeMedicamento;
		this.preco = preco;
		this.quantidadeEstoque = 1;
		this.componente = " ";
		this.lote = 0;
		this.validade = " ";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeMedicamento() {
		return nomeMedicamento;
	}
	
	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getComponente() {
		return componente;
	}
	
	public void setComponente(String componente) {
		this.componente = componente;
	}
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public int getLote() {
		return lote;
	}
	
	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public String getValidade() {
		return validade;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public void addMedicamento() {
		//TODO: verificar se esse processo é o mesmo do crud 
	}
	
	public void removeMedicamento() {
		//TODO: verificar se esse processo é o mesmo do crud
	}
	
	public void addEmEstoque() {
		//TODO: adicionar a quantidade no atributo de estoque
	}
	
	public void removeEmEstoque() {
		//TODO: remover a quantidade no atributo de estoque
	}
}
