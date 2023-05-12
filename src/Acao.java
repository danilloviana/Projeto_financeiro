public class Acao extends InstrumentoFinanceiro {

    private int quantidadeCotas;

    public Acao(int quantidadeCotas) {
        super();
        this.quantidadeCotas = quantidadeCotas;
    }

    public void setQuantidadeCotas(int quantidadeCotas) {
        this.quantidadeCotas = quantidadeCotas;
    }

    public float calcularSaldoTotal() {
        return getSaldo() * quantidadeCotas;
    }
}

	



