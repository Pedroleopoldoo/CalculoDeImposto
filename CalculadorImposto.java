
public class CalculadorImposto {
	public static void main(String[] args) {
		AcaoBolsa ab = new AcaoBolsa();
		ab.setValor(2000);
		ab.setTaxa(20);
		System.out.println(ab.getValorImposto());
		
		
		ContaCorrente ct = new ContaCorrente();
		ct.setValor(2000);
		ct.setTaxa(5);
		System.out.println(ct.getValorImposto());
		
		SeguroDeVida sdv = new SeguroDeVida();
		sdv.setValor(2000);
		sdv.setTaxa(10);
		System.out.println(sdv.getValorImposto());
	}
}
