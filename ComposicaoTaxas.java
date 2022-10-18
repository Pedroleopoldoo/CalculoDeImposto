
public class ComposicaoTaxas implements Tributavel{
	
	private double valor;
	private double taxa;
	
	
	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public double getValorImposto() {
		valor = valor - valor * taxa / 100;
		return valor;
	}
	
	
}
