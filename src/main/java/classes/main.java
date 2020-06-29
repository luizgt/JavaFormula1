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
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException{
        ArrayList <Corrida> corridas = new ArrayList<>();      
        ArrayList <Escuderia> escuderias = new ArrayList<>();
        
        Escuderia escMercedes = new Escuderia("Mercedes");
            settingCarros(escMercedes);
            settingPilotos(escMercedes);
            settingEngenheiros(escMercedes);
            settingMecanicos(escMercedes);

        Escuderia escFerrari = new Escuderia("Ferrari");
            settingCarros(escFerrari);
            settingPilotos(escFerrari);
            settingEngenheiros(escFerrari);
            settingMecanicos(escFerrari);
            
        Escuderia escBMW = new Escuderia("BMW");
            settingCarros(escBMW);
            settingPilotos(escBMW);
            settingEngenheiros(escBMW);
            settingMecanicos(escBMW);
        
        
        Escuderia escMcLaren = new Escuderia("McLaren");
            settingCarros(escMcLaren);
            settingPilotos(escMcLaren);
            settingEngenheiros(escMcLaren);
            settingMecanicos(escMcLaren);
            
        Escuderia escLotus = new Escuderia("Lotus Elise");
            settingCarros(escLotus);
            settingPilotos(escLotus);
            settingEngenheiros(escLotus);
            settingMecanicos(escLotus);
            
        Escuderia escRenault = new Escuderia("Renault");
            settingCarros(escRenault);
            settingPilotos(escRenault);
            settingEngenheiros(escRenault);
            settingMecanicos(escRenault);

        escuderias.add(escMercedes);
        escuderias.add(escFerrari);
        escuderias.add(escBMW);
        escuderias.add(escLotus);
        escuderias.add(escRenault);
        
        corridas.add(new Corrida("São Paulo", 99));
        corridas.add(new Corrida("Londres", 120));
        corridas.add(new Corrida("Tokio", 40));
        corridas.add(new Corrida("GP do Marrocos", 120));
//        corridas.add(new Corrida("GP da Grã-Bretranha", 120));
//        corridas.add(new Corrida("GP da Austrália", 120));
//        corridas.add(new Corrida("GP dos Estados Unidos", 120));
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
        
        Campeonato campeonato1 = new Campeonato(corridas, escuderias);
        
        campeonato1.IniciarCampeonato();        
    }
    
    private static void settingPilotos(Escuderia escuderia){
        escuderia.adicionarPilotos(new Piloto("Luizinho"));
        escuderia.adicionarPilotos(new Piloto("Giulia"));
        
    }
    
    private static void settingMecanicos(Escuderia escuderia){
        escuderia.adicionarMecanicos(new Mecanico("Clovona"));
        escuderia.adicionarMecanicos(new Mecanico("Bruninha"));
        escuderia.adicionarMecanicos(new Mecanico("Levizinho"));
        escuderia.adicionarMecanicos(new Mecanico("Tiaguinho"));
    }
    
    private static void settingEngenheiros(Escuderia escuderia){
       escuderia.adicionarEngenheiros(new Engenheiro("Milton"));
       escuderia.adicionarEngenheiros(new Engenheiro("Danilo"));
    }
    
    private static void settingCarros(Escuderia escuderia){
        escuderia.adicionarCarros(new Carro (1, escuderia.getNomeEscuderia(), 120));
        escuderia.adicionarCarros(new Carro (2, escuderia.getNomeEscuderia(), 120));
    }
}
