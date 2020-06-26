/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Giulia
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList <Corrida> corridas = new ArrayList<>();
        
        Piloto piloto1 = new Piloto("Luizinho");
        Piloto piloto2 = new Piloto("Giulia");
        
        Mecanico mecanico1 = new Mecanico("Clovona");
        Mecanico mecanico2 = new Mecanico("Bruninha");
        Mecanico mecanico3 = new Mecanico("Levizinho");
        Mecanico mecanico4 = new Mecanico("Tiaguinho");
        
        Engenheiro engenheiro1 = new Engenheiro("Milton");
        Engenheiro engenheiro2 = new Engenheiro("Danilo");
        
        ArrayList <Carro> carros = new ArrayList();
        carros.add(new Carro (1, "Mercedes", 54));
        carros.add(new Carro (2, "Mercedes", 54));
        carros.add(new Carro (1, "Ferrari", 45));
        carros.add(new Carro (2, "Ferrari", 54));
        carros.add(new Carro (1, "McLaren", 54));
        carros.add(new Carro (2, "McLaren", 54));
        carros.add(new Carro (1, "BMW", 54));
        carros.add(new Carro (2, "BMW", 54));
        
        
        Escuderia escuderia = new Escuderia("escuderia legal");
        
        boolean verificacao;
        
        verificacao = escuderia.adicionarEngenheiros(engenheiro1);
//        if(verificacao){
//            System.out.println("engenheiro cadastrado com sucesso!!");
//        }
        escuderia.adicionarEngenheiros(engenheiro2);
        escuderia.adicionarMecanicos(mecanico1);
        escuderia.adicionarMecanicos(mecanico2);
        escuderia.adicionarMecanicos(mecanico3);
        escuderia.adicionarMecanicos(mecanico4);
        escuderia.adicionarPilotos(piloto1);
        escuderia.adicionarPilotos(piloto2);
        escuderia.adicionarCarros(carros.get(0));
        escuderia.adicionarCarros(carros.get(1));
        
        String informacao = escuderia.informacoesEscuderia();
        
//        System.out.println(informacao);

        corridas.add(new Corrida("São Paulo", 99, carros));
        corridas.add(new Corrida("Londres", 120, carros));
        corridas.add(new Corrida("Tokio", 40, carros));
        corridas.add(new Corrida("GP do Marrocos", 120, carros));
        corridas.add(new Corrida("GP da Grã-Bretranha", 120, carros));
        corridas.add(new Corrida("GP da Austrália", 120, carros));
        corridas.add(new Corrida("GP dos Estados Unidos", 120, carros));
//        corridas.add(new Corrida("GP da Alemanha", 120, carros));
//        corridas.add(new Corrida("GP do Bahrein", 120, carros));
//        corridas.add(new Corrida("GP da Europa", 120, carros));
//        corridas.add(new Corrida("GP do Azerbaijão", 120, carros));
//        corridas.add(new Corrida("GP da Espanha", 120, carros));
//        corridas.add(new Corrida("GP da Suíça", 120, carros));
//        corridas.add(new Corrida("GP da Índia", 120, carros));
//        corridas.add(new Corrida("GP da França", 120, carros));
//        corridas.add(new Corrida("GP do Canadá", 120, carros));
//        corridas.add(new Corrida("GP do México", 120, carros));
//        corridas.add(new Corrida("GP da Turquia", 120, carros));
//        corridas.add(new Corrida("GP do Brasil", 120, carros));
        
        Campeonato campeonato1 = new Campeonato(corridas, carros);
        campeonato1.adicionarEscuderias(escuderia);
        
        campeonato1.IniciarCampeonato();
//        corrida3.largada(); //a corrida esta acontecendo aqui por enquanto, apenas para teste!!!!!
        
//        String infoCampeonato = campeonato1.informacoesCampeonato();
        
//        System.out.println("\n\nCampeonato\n");
//        System.out.println(infoCampeonato);
        
    }
}
