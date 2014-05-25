package fatec.poo.projeto.model;

public class Vendedor extends Pessoa {

	private int IdVendedor;
	private String TaxaComissao;
	private double SalarioBase;
	
	public Vendedor(int id, String cpf, String nome, String taxa  ) {
		super(cpf, nome);
		IdVendedor = id;
		TaxaComissao = taxa;
		// TODO Stub de construtor gerado automaticamente
	}

	public String getTaxaComissao() {
		return TaxaComissao;
	}

	public void setTaxaComissao(String taxaComissao) {
		TaxaComissao = taxaComissao;
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	
	

}
