package br.edu.unifil.lb1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaDiamante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaDiamante extends Consulta
{
    public ConsultaDiamante(String tipoPlano, String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
       super(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
   }
    
    public double getValorConsulta(){
        return valorConsulta - (valorConsulta * 0.4);
    }
}
