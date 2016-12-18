package ceputil;

public class Cep {
	public String cep;
	public String logradouro;
	public String bairro;

	public Cep(String cep, String logradouro, String bairro) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;

	}

	public Cep() {
		this.cep = null;
		this.logradouro = null;
		this.bairro = null;
				
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
