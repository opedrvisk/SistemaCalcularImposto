package receitafederal;

public class Contribuinte {

    protected String nome;
    protected double rendaBrutaAnual;
    protected double rendaLiquidaAnual;

    /**
     * Construtor
     *
     * @param nome
     * @param rendaBrutaAnual
     */
    public Contribuinte(String nome, double rendaBrutaAnual) {
        this.nome = nome;
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    /**
     * set nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * set renda bruta anual
     *
     * @param rendaBrutaAnual
     */
    public void setRendaBrutaAnual(double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    /**
     * métodos get
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    public double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public double getRendaLiquidaAnual() {
        return rendaLiquidaAnual;
    }

    public double CalcularRendaLiquida(double abatimento1, double abatimento2) {
        rendaLiquidaAnual = rendaBrutaAnual - (abatimento1 + abatimento2);
        return rendaLiquidaAnual;
    }
}
