package fatec.poo.projeto.model;

public abstract class Pessoa {
	private String CPF;
	private String Nome;
	private String Endereco;
	private String CEP;
	private String UF;
	private Byte TelefoneDDD;
	private String TelefoneNumero;
	
	public Pessoa( String cpf, String nome){
		CPF = cpf;
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public Byte getTelefoneDDD() {
		return TelefoneDDD;
	}

	public void setTelefoneDDD(Byte dDD) {
		TelefoneDDD = dDD;
	}

	public String getTelefoneNumero() {
		return TelefoneNumero;
	}

	public void setTelefoneNumero(String numero) {
		TelefoneNumero = numero;
	}
	
	
}
