package br.edu.unifil.lb1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaOuro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaOuro extends Consulta
{
    public ConsultaOuro(String tipoPlano, String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
       super(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
   }
    
    public double getValorConsulta(){
        if(anoInclusaoPlano <= 2000){
            return valorConsulta = 0;
        }else{
            return valorConsulta - (valorConsulta * 0.3);
        }
    }
}
