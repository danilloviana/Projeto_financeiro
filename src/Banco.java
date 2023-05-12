public class Banco {

    private ArrayList<InstrumentoFinanceiro> instrumentosFinanceiros = new ArrayList<>();

    public void adicionarInstrumento(InstrumentoFinanceiro instrumento) {
        instrumentosFinanceiros.add(instrumento);
    }

    public float calcularSaldoTotal() {
        float saldoTotal = 0;
        for (InstrumentoFinanceiro instrumento : instrumentosFinanceiros) {
            saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Bem-vindo!");
        System.out.println("Digite o saldo inicial: ");
        float saldoInicial = scanner.nextFloat();

        int escolha;
        do {
            System.out.println("1 - Adicionar Ação");
            System.out.println("2 - Adicionar Conta Corrente");
            System.out.println("3 - Adicionar Fundo de Aplicação");
            System.out.println("4 - Calcular Saldo Total");
            System.out.println("5 - Encerrar");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a quantidade de cotas: ");
                    int quantidadeCotas = scanner.nextInt();
                    Acao acao = new Acao(quantidadeCotas);
                    acao.setSaldo(saldoInicial);
                    banco.adicionarInstrumento(acao);
                    System.out.println("Valor total das cotas: " + acao.calcularSaldoTotal());
                    break;
                case 2:
                    System.out.println("Digite o limite da conta corrente: ");
                    float limiteContaCorrente = scanner.nextFloat();
                    ContaCorrente contaCorrente = new ContaCorrente(limiteContaCorrente);
                    contaCorrente.setSaldo(saldoInicial);
                    banco.adicionarInstrumento(contaCorrente);
                    System.out.println("Valor total da conta corrente: " + contaCorrente.calcularSaldoTotal());
                    break;
                case 3:
                    System.out.println("Digite a rentabilidade mensal do fundo de aplicação: ");
                    float rentabilidadeMensal = scanner.nextFloat();
                    FundoDeAplicacao fundoDeAplicacao = new FundoDeAplicacao(rentabilidadeMensal);
                    fundoDeAplicacao.setSaldo(saldoInicial);
                    banco.adicionarInstrumento(fundoDeAplicacao);
                    System.out.println("Valor total do fundo de aplicação: " + fundoDeAplicacao.calcularSaldoTotal());
                    break;
                case 4:
                    System.out.println("Saldo total dos instrumentos financeiros: " + banco.calcularSaldoTotal());
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);

        System.out.println("Saldo final total dos instrumentos financeiros:

