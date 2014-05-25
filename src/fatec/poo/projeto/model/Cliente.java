package fatec.poo.projeto.model;

public class Cliente extends Pessoa{
	
	private int IdCliente;
	private double LimiteCredito;
	private double LimiteDisponivel;
	
	public Cliente(int id, String cpf, String nome, double lmtCred) {
		super(cpf, nome);
		IdCliente = id;
		LimiteCredito = lmtCred;
		LimiteDisponivel = LimiteCredito;		
	}
	
	//Arrumar mellhor depois...
	public double getLimiteCredito() {
		return LimiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		LimiteCredito = limiteCredito;
	}

	public double getLimiteDisponivel() {
		return LimiteDisponivel;
	}

	public void setLimiteDisponivel(double limiteDisponivel) {
		LimiteDisponivel = limiteDisponivel;
	}
	

	
}
