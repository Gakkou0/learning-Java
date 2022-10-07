package q.questao01;

/**
 *
 * @author fhugo
 */
public class ContaLuz {
    private String contaCodigo;
    private int dataLeitura;
    private int kwGasto;
    private double valorDaConta;
    private int dataVencimento;
    private boolean pagoNoPrazo;

    public ContaLuz(String contaCodigo, int dataLeitura, int kwGasto, double valorDaConta, int dataVencimento, boolean pagoNoPrazo) {
        this.setContaCodigo(contaCodigo);
        this.setDataLeitura(dataLeitura);
        this.setKwGasto(kwGasto);
        this.setValorDaConta(valorDaConta);
        this.setDataVencimento(dataVencimento);
        this.setPagoNoPrazo(pagoNoPrazo);
    }

    public boolean isPagoNoPrazo() {
        return pagoNoPrazo;
    }

    public void setPagoNoPrazo(boolean pagoNoPrazo) {
        this.pagoNoPrazo = pagoNoPrazo;
    }

    public String getContaCodigo() {
        return contaCodigo;
    }

    public void setContaCodigo(String contaCodigo) {
        this.contaCodigo = contaCodigo;
    }

    public int getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(int dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public int getKwGasto() {
        return kwGasto;
    }

    public void setKwGasto(int kwGasto) {
        this.kwGasto = kwGasto;
    }

    public double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    @Override
        public String toString(){
        return "Data de Leitura: " + this.getDataLeitura() +
                "\nData de vencimento: " + this.getDataVencimento() +
                "\nCodigo da Conta: " + this.getContaCodigo() +
                "\nKw Gasto: " + this.getKwGasto() +
                "\nValor da conta: R$ " + this.getValorDaConta() +
                "\nFoi pago dentro do prazo: " + this.isPagoNoPrazo();
        }
}


