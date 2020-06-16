/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Giulia
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Luizinho");
        Piloto piloto2 = new Piloto("Giulia");
        
        Mecanico mecanico1 = new Mecanico("Clovona");
        Mecanico mecanico2 = new Mecanico("Bruninha");
        Mecanico mecanico3 = new Mecanico("Levizinho");
        Mecanico mecanico4 = new Mecanico("Tiaguinho");
        
        Engenheiro engenheiro1 = new Engenheiro("Milton");
        Engenheiro engenheiro2 = new Engenheiro("Danilo");
        
        Carro carro1 = new Carro (1, "escuderia legal", 45);
        Carro carro2 = new Carro (2, "escuderia legal", 54);
        
        Escuderia escuderia = new Escuderia("escuderia legal");
        
        boolean verificacao;
        
        verificacao = escuderia.adicionarEngenheiros(engenheiro1);
        if(verificacao){
            System.out.println("engenheiro cadastrado com sucesso!!");
        }
        escuderia.adicionarEngenheiros(engenheiro2);
        escuderia.adicionarMecanicos(mecanico1);
        escuderia.adicionarMecanicos(mecanico2);
        escuderia.adicionarMecanicos(mecanico3);
        escuderia.adicionarMecanicos(mecanico4);
        escuderia.adicionarPilotos(piloto1);
        escuderia.adicionarPilotos(piloto2);
        escuderia.adicionarCarros(carro1);
        escuderia.adicionarCarros(carro2);
        
        String informacao = escuderia.informacoesEscuderia();
        
        System.out.println(informacao);
        
        Corrida corrida1 = new Corrida("São Paulo");
        Corrida corrida2 = new Corrida("Londres");
        Corrida corrida3 = new Corrida("Tokio");
        
        Campeonato campeonato1 = new Campeonato(corrida1);
        campeonato1.adicionarCorridas(corrida3);
        campeonato1.adicionarCorridas(corrida2);
        campeonato1.adicionarEscuderias(escuderia);
        
        String infoCampeonato = campeonato1.informacoesCampeonato();
        
        System.out.println("\n\nCampeonato\n");
        System.out.println(infoCampeonato);
        
    }
}
