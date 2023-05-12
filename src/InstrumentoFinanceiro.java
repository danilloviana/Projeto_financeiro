public abstract class InstrumentoFinanceiro {

    private float saldo;

    public InstrumentoFinanceiro() {
        
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract float calcularSaldoTotal();
}
