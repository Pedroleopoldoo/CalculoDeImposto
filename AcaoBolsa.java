
public class AcaoBolsa implements Tributavel {
	
	private ComposicaoTaxas constroi;
	
	public AcaoBolsa() {
		this.constroi = new ComposicaoTaxas();
	}
	
	@Override
	public void setValor(double valor) {
		constroi.setValor(valor);
	}
	
	@Override
	public void setTaxa(double taxa) {
		constroi.setTaxa(taxa);
	}
	
	@Override
	public double getValorImposto() {
		return constroi.getValorImposto();
	}
	
}
