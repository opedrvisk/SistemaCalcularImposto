package receitafederal;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;
    private double gastosPessoal;
    private double gastosEquipamento;

    public PessoaJuridica(String cnpj, double gastosPessoal, double gastosEquipamento, String nome, double rendaBrutaAnual) {
        super(nome, rendaBrutaAnual);
        this.cnpj = cnpj;
        this.gastosPessoal = gastosPessoal;
        this.gastosEquipamento = gastosEquipamento;
    }

    public String getCpnj() {
        return cnpj;
    }

    public double getGastosPessoal() {
        return gastosPessoal;
    }

    public double getGastosEquipamento() {
        return gastosEquipamento;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setGastosPessoal(double gastosPessoal) {
        this.gastosPessoal = gastosPessoal;
    }

    public void setGastosEquipamento(double gastosEquipamento) {
        this.gastosEquipamento = gastosEquipamento;
    }

    public double calcularImpostoDeRenda() {
        double impostoDeRenda;
        if (rendaLiquidaAnual <= 100000) {
            impostoDeRenda = rendaLiquidaAnual * 0.05 - 0;
        } else if (rendaLiquidaAnual > 200000) {
            impostoDeRenda = rendaLiquidaAnual * 0.30 - 45000;
        } else {
            impostoDeRenda = rendaLiquidaAnual * 0.10 - 5000;
        }
        return impostoDeRenda;
    }
}
