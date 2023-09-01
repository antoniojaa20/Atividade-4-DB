package com.unifacisa.Aula04;

public class Pessoa {
	
	private long id;
    private String nome;
    private int idade;
    private String matricula;
    private String telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
	@Override
	
	public String toString() {
		String retorno = "Id: " + id + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" 
				+ "Matrícula: " + matricula + "\n" + "Telefone: " + telefone + "\n";
		return retorno;
	}
}
