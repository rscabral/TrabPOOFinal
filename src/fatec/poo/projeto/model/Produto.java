package fatec.poo.projeto.model;

public class Produto {
	
	private int IdProduto;
	private String Descricao;
	private double QtDisponivel;
	private double PrecoUnit;
	private double EstoqueMinimo;
	
	public Produto(int id, String desc){
		IdProduto = id;
		Descricao = desc;
	}

	public double getQtDisponivel() {
		return QtDisponivel;
	}

	public void setQtDisponivel(double qtDisponivel) {
		QtDisponivel = qtDisponivel;
	}

	public double getPrecoUnit() {
		return PrecoUnit;
	}

	public void setPrecoUnit(double precoUnit) {
		PrecoUnit = precoUnit;
	}

	public double getEstoqueMinimo() {
		return EstoqueMinimo;
	}

	public void setEstoqueMinimo(double estoqueMinimo) {
		EstoqueMinimo = estoqueMinimo;
	}
	
	
}
