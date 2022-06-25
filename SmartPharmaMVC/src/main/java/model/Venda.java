package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name = "receita", length = 10, nullable = false)
	protected Receita receita;
	
	@Column(name = "medicamento", length = 155, nullable = false)
	protected Medicamento medicamento;
	
	@Column(name = "data_venda", length = 15)
	protected Date dataVenda;
	
	@Column(name = "quantidade", length = 10)
	protected int quantidade;
	
	@Column(name = "valor_total", length = 15, nullable = false)
	protected float valorTotal;
	
	public Venda(int id, Medicamento medicamento) {
		this.id = id;
		this.medicamento = medicamento;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void verificarValidadeReceita()
	{
		if (this.getReceita().validarReceita())
			System.out.println("Receita: " + this.getReceita().getId() + " está válida!");
		else {
			System.out.println("Receita inválida!");
		}
		
	}
	
	public void efetuarVenda()
	{
		//TODO: apenas incluir os dados na tabela venda e diminuir o valor no estoque
	}
	
	public void consultarVenda()
	{
		//TODO: apenas exibir os dados do bd
	}

}
