
import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        int opcao = 0;

        //Declaração de variaveis 
        String nome = "Clark Kent";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        System.out.println("************************");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("\nTipo da conta:"+ tipoConta);
        System.out.println("Valor: "+ saldo);
        System.out.println("\n**************************\n");
        String menu = """
                ** Digite sua Opção **
                1- Consultar saldo
                2- Transferir valor
                3- Receber Valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4 ){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("O saldo atualizado é : "+ saldo);
            } else if(opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente");
                }else{
                    saldo = saldo - valor;
                }
            }else if(opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: "+ saldo);

            }else if(opcao != 4){
                System.out.println("Opcao invalida");
            }

        }
        leitura.close();
    }
}
