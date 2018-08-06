package br.edu.unifil.lb1.consulta.visao;
import java.util.Scanner;
import br.edu.unifil.lb1.consulta.Controle.CadastroDeConsultas;
/**
 * Escreva a descrição da classe SistemaDaClinica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SistemaDaClinica
{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        CadastroDeConsultas cadastroDC = new CadastroDeConsultas();
        
        String consultaPlano;
        String tipoPlano;
        String nome;
        int matricula;
        int dependentes;
        int anoInclusaoPlano;
        double valorConsulta;
        int opcao = 0;
       
        while(opcao != 9 ){
            System.out.println("\n1 - Incluir Plano");
            System.out.println("2 - Listar Planos");
            System.out.println("3 - Quantia de Consultas");
            System.out.println("9 - Encerrar");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1 :
                    System.out.print("\n Tipo de Plano : ");
                    tipoPlano = scanner.nextLine();
                    System.out.print("\n Nome : ");
                    nome = scanner.next();
                    System.out.print("\n Matricula : ");
                    matricula = scanner.nextInt();
                    System.out.print("\n Numero de Dependentes : ");
                    dependentes = scanner.nextInt();
                    System.out.print("\n Ano de Inclusao do Plano : ");
                    anoInclusaoPlano = scanner.nextInt();
                    System.out.print("\n Valor da Consulta : ");
                    valorConsulta = scanner.nextDouble();
                    System.out.println("\n");
                    cadastroDC.incluirPlano(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
                    break;         
                    
                case 2 : 
                    // System.out.println("\n Qual Plano quer consultar ?");
                    // consultaPlano = scanner.nextLine();
                    cadastroDC.listarConsultas();
                    
                case 3 : 
                    cadastroDC.quantConsulta();
                    
                case 4: 
                     
                    
                case 9 :
            }
        }
    }
}
