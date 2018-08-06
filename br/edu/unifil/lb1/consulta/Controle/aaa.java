package br.edu.unifil.lb1.consulta.Controle;
import br.edu.unifil.lp1.consulta.modelo.*;

public class aaa
{
    private Consulta[] listaConsultas = new Consulta[10];
    private int numConsulta = 0;

    public void incluirConsulta(String nomeDoPaciente,
    String matricula, int numeroDeDependentes, int anoDeInclusaoNoPlano, float valorDaConsulta, int planoPaciente){
        Consulta cnt = null;
        if(planoPaciente == 1){
            //Diamante
            cnt = new ConsultaDiamante(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }else if(planoPaciente == 2){
            //Ouro
            cnt = new ConsultaOuro(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }else if(planoPaciente == 3){
            //Prata
            cnt = new ConsultaPrata(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }else if(planoPaciente == 4){
            //Familia
            cnt = new ConsultaFamilia(nomeDoPaciente, matricula, numeroDeDependentes,
                anoDeInclusaoNoPlano, valorDaConsulta, planoPaciente);
        }
        cnt.setNomeDoPaciente(nomeDoPaciente);
        cnt.setMatricula(matricula);
        cnt.setNumeroDeDependentes(numeroDeDependentes);
        cnt.setAnoDeInclusaoNoPlano(anoDeInclusaoNoPlano);
        cnt.setValorDaConsulta(valorDaConsulta);
        cnt.setPlanoPaciente(planoPaciente);

        listaConsultas[ numConsulta++ ] = cnt;
    }

    public void consultasPorPlano(int consultaPlano){
        for (int i = 0; i < listaConsultas.length; i++){
            if(listaConsultas[i] == null);
            else if(consultaPlano == listaConsultas[i].getPlanoPaciente()) {
                System.out.println("Nome: " + listaConsultas[i].getNomeDoPaciente()
                          + ", Matricula: " + listaConsultas[i].getMatricula());
            }
        }
    }

    public void numeroConsultas(int consultaPlano){
        int contConsulta = 0;
        for (int i = 0; i < listaConsultas.length; i++){
            if(listaConsultas[i] == null);
            else if(consultaPlano == listaConsultas[i].getPlanoPaciente()){
                contConsulta++;
            }
        }
        System.out.println("Existem " + contConsulta++ + " neste plano");
    }

    public void valorTotalConsultas(int consultaPlano){
        float valorConsulta = 0;
        for (int i = 0; i < listaConsultas.length; i++){
            if(listaConsultas[i] == null);
            else if(consultaPlano == listaConsultas[i].getPlanoPaciente()){
                float j = listaConsultas[i].getValorDaConsulta();
                valorConsulta += j;
            }
        }
        System.out.println("O valor total de consultas deste plano Ã©: " + valorConsulta);
    }
}

