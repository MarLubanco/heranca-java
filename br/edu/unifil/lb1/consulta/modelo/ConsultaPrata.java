package br.edu.unifil.lb1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaPrata aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaPrata extends Consulta
{
   public ConsultaPrata(String tipoPlano,String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
       super(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
   }
    
    public double getValorConsulta(){
       return valorConsulta - (valorConsulta * 0.2);
   }
}
