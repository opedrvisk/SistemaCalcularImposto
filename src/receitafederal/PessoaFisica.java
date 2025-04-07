package receitafederal;

public class PessoaFisica extends Contribuinte {

    private String cpf;
    private double gastosSaude;
    private double gastosEducacao;

    public PessoaFisica(String cpf, double gastosSaude, double gastosEducacao, String nome, double rendaBrutaAnual) {
        super(nome, rendaBrutaAnual);
        this.cpf = cpf;
        this.gastosSaude = gastosSaude;
        this.gastosEducacao = gastosEducacao;
    }

    public String getCpf() {
        return cpf;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }

    public double calcularImpostoDeRenda() {
        double impostoDeRenda;
        if (rendaLiquidaAnual <= 10000) {
            impostoDeRenda = rendaLiquidaAnual * 0 - 0;
        } else if (rendaLiquidaAnual > 20000) {
            impostoDeRenda = rendaLiquidaAnual * 0.25 - 4000;
        } else {
            impostoDeRenda = rendaLiquidaAnual * 0.10 - 1000;
        }
        return impostoDeRenda;
    }

}
