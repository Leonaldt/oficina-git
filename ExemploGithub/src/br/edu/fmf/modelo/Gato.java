/*
 * Oficina Git
 * Equipe: Leonaldt Cobain / Aldhemir Thiago.
 * Data: 07/02/2018.
 * Descrição: Classe para representar um Gato.
 * 
 */

package br.edu.fmf.modelo;

public class Gato {

	private String nome;
	private String cor;
	private Integer idade;
	
	public Gato() {
	}
	
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void correr() {
		System.out.println("Correndo (Cansado :-( ");
	}

	public void dormi() {
		System.out.println("Dormindo...");
	}
	
	public void comer(String comida) {
		System.out.println("Comendo "+comida);
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}

