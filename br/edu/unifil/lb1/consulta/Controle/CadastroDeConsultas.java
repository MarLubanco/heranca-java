package br.edu.unifil.lb1.consulta.Controle;
import java.util.Arrays;
import br.edu.unifil.lb1.consulta.modelo.*;
/**
 * Escreva a descrição da classe CadastroDeConsultas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroDeConsultas
{
    Consulta listaConsultas[];
    private int numConsulta = 0;
    private int numConsultaPrata = 0;
    private int numConsultaOuro = 0;
    private int numConsultaDiamante = 0;
    private int numConsultaFamilia = 0;
    int c = 0;
    
    
    //Consulta cons = new Consulta(nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
    public CadastroDeConsultas(){
        listaConsultas = new Consulta[10];
    }
    
    public void incluirPlano(String tipoPlano, String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
        Consulta consulta = null;
        if(tipoPlano.equals("ConsultaPrata")){
            consulta = new ConsultaPrata(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
            //listaConsultas[c] = consulta;
            //c++;
            numConsultaPrata++;
            //System.out.println(consulta.getValorConsulta());
        }else if(tipoPlano.equals("ConsultaOuro")){
            consulta = new ConsultaOuro(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
            //listaConsultas[c] = consulta;
            //c++;
            numConsultaOuro++;
            //System.out.println(consulta.getValorConsulta());
            
        }else if(tipoPlano.equals("ConsultaDiamante")){
            consulta = new ConsultaDiamante(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
            //listaConsultas[c] = consulta;
            //c++;
             numConsultaDiamante++;
            //System.out.println(consulta.getValorConsulta());
           
         }else if(tipoPlano.equals("ConsultaFamilia")){
            consulta = new ConsultaFamilia(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
            //listaConsultas[c] = consulta;
            //c++;
            numConsultaFamilia++;
            //System.out.println(consulta.getValorConsulta());
            
        }
          
        consulta.setTipoPlano(tipoPlano);
        consulta.setNome(nome);
        consulta.setMatricula(matricula);
        consulta.setDependentes(dependentes);
        consulta.setAnoInclusaoPlano(anoInclusaoPlano);
        consulta.setValorConsulta(valorConsulta);
        
        System.out.print("Nome: " + consulta.getNome() 
                         + "\n" + "Matricula: " + consulta.getMatricula() 
                         + "\n" + "Nº de Dependentes: " + consulta.getDependentes()
                         + "\n" + "Ano do Plano: " + consulta.getAnoInclusaoPlano() 
                         + "\n" + "Valor da Consulta: " + consulta.getValorConsulta());
        
        listaConsultas[numConsulta++] = consulta;
    }
    
    // public void listaC(String consultaPlano){
        // for(int i = 0; i < listaConsultas.length; i++){
           // if(consultaPlano == listaConsultas[i].getTipoPlano()){
               // System.out.print("Nome: " + listaConsultas[i].getNome() 
                         // + "\n" + "Matricula: " + listaConsultas[i].getMatricula() 
                         // + "\n" + "Nº de Dependentes: " + listaConsultas[i].getDependentes()
                         // + "\n" + "Ano do Plano: " + listaConsultas[i].getAnoInclusaoPlano() 
                         // + "\n" + "Valor da Consulta: " + listaConsultas[i].getValorConsulta());
           // }
        // }
    // }
    
    
   public void listarConsultas(){
       for (int i=0; i < listaConsultas.length; i++){
         Consulta consulta;
           
           if ( listaConsultas[i] != null ){
               consulta = listaConsultas[i];
          System.out.println (consulta.getNome()+ " "  + consulta.getMatricula()+ " " + consulta.getDependentes()   );
          // System.out.println (consulta);
         }else {
            System.out.println("Nulo"); 
             
            }
         }
         
     }
     
     public void quantConsulta(){
        System.out.println("\n" + "Numero de Consultas Prata : " + numConsultaPrata + "\n" +
                           "Numero de Consultas Ouro : " + numConsultaOuro + "\n" +
                           "Numero de Consultas Diamanete : " + numConsultaDiamante + "\n" +
                           "Numero de Consultas Famillia : " + numConsultaFamilia);
        
    }
    
    
}
