package br.edu.unifil.lb1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaFamilia aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaFamilia extends Consulta
{
    public ConsultaFamilia(String tipoPlano, String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
       super(tipoPlano,nome,matricula,dependentes,anoInclusaoPlano,valorConsulta);
   }
    
    public double getValorConsulta(){
        if(dependentes > 2){
            return valorConsulta - (valorConsulta * 0.5);
        }else{
            return valorConsulta;
        }
    }
}
