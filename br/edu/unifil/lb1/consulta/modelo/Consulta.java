package br.edu.unifil.lb1.consulta.modelo;


/**
 * Escreva a descrição da classe Consulta aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Consulta
{
   protected String tipoPlano;
   protected String nome;
   protected int matricula;
   protected int dependentes;
   protected int anoInclusaoPlano;
   protected double valorConsulta;
   
   public Consulta(String tipoPlano,String nome, int matricula, int dependentes, int anoInclusaoPlano, double valorConsulta){
       this.tipoPlano = tipoPlano;
       this.nome = nome;
       this.matricula = matricula;
       this.dependentes = dependentes;
       this.anoInclusaoPlano = anoInclusaoPlano;
       this.valorConsulta = valorConsulta;
   }
   
   public String getTipoPlano(){
       return this.tipoPlano;
   }
   
   public String getNome(){
        return this.nome;
   }
    
   public int getMatricula(){
        return this.matricula;
   }
    
   public int getDependentes(){
        return this.dependentes;
   }
    
   public int getAnoInclusaoPlano(){
        return this.anoInclusaoPlano;
   }
    
   public double getValorConsulta(){
        return this.valorConsulta;
   }
   
   public void setTipoPlano(String tipoPlano){
       this.tipoPlano = tipoPlano;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
    
   public void setMatricula(int matricula){
        this.matricula = matricula;
   }
    
   public void setDependentes(int dependentes){
        this.dependentes = dependentes;
   }
   
   public void setAnoInclusaoPlano(int anoInclusaoPlano){
       this.anoInclusaoPlano = anoInclusaoPlano;
   }
    
   public void setValorConsulta(double valorConsulta){
        this.valorConsulta = valorConsulta;
   }
}
