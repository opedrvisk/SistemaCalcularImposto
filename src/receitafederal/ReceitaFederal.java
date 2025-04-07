package receitafederal;

import java.util.Scanner;

public class ReceitaFederal {

    public static void main(String[] args) {
        PessoaJuridica jud1; 
        PessoaFisica fis1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o seu nome: ");
        String nome = entrada.nextLine().toLowerCase();
        
        // Juridica
        System.out.print("Insira o seu cnpj: " );
        String cnpj = entrada.nextLine();
        System.out.println("Qual seu rendimento bruto: ");
        double rendaBrutaAnual = entrada.nextDouble();
        System.out.println("Qual o seu gasto pessoal: ");
        double gastosPessoal = entrada.nextDouble();
        System.out.println("Qual seu gasto com equipamentos: ");
        double gastosEquipamento = entrada.nextDouble();
        
        jud1 = new PessoaJuridica(cnpj, gastosPessoal, gastosEquipamento, nome, rendaBrutaAnual);
        jud1.CalcularRendaLiquida(jud1.getGastosPessoal(), jud1.getGastosEquipamento());
        System.out.println("Seu imposto de renda e:" + jud1.calcularImpostoDeRenda());
        
        // Fisica
        System.out.print("Insira o seu cpf: " );
        entrada.nextLine(); 
        String cpf = entrada.nextLine();
        System.out.println("Qual seu rendimento bruto: ");
        rendaBrutaAnual = entrada.nextDouble();
        System.out.println("Qual o seu gasto com saude: ");
        double gastosSaude = entrada.nextDouble();
        System.out.println("Qual seu gasto com educacao: ");
        double gastosEducacao = entrada.nextDouble();
        
        fis1 = new PessoaFisica(cpf, gastosSaude, gastosEducacao, nome, rendaBrutaAnual);
        fis1.CalcularRendaLiquida(fis1.getGastosSaude(), fis1.getGastosEducacao());
        System.out.println("Seu imposto de renda e:" + fis1.calcularImpostoDeRenda());
    }
}