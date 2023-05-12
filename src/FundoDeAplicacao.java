public class FundoDeAplicacao extends InstrumentoFinanceiro {

    private float rentabilidade;

    public FundoDeAplicacao(float rentabilidade) {
        super();
        this.rentabilidade = rentabilidade;
    }

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public float calcularSaldoTotal() {
        return getSaldo() + (getSaldo() * rentabilidade / 100);
    }
}
