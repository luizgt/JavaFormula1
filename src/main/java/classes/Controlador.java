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
public class Controlador {
    private static ArrayList <Corrida> corridas = new ArrayList<>();      
    private static ArrayList <Escuderia> escuderias = new ArrayList<>();
    
    public Controlador(){
        corridas.add(new Corrida("São Paulo", 99));
        corridas.add(new Corrida("Londres", 120));
        corridas.add(new Corrida("Tokio", 120));
        corridas.add(new Corrida("GP do Marrocos", 120));
        
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
    
    public static void adicionarCorrida(String cidade, int numVoltas){
        corridas.add(new Corrida(cidade, numVoltas));
    }
    
    public static String relatorioCorridas(){
        String relatorio = "";
        for(Corrida c : corridas){
            relatorio += c.getCidade()+ " - número de voltas: " + c.getQtdVoltas() + "\n" ;
        }
        return relatorio;
    }
    
    public static String relatorioEscuderias(){
        String relatorio = "";
        for(Escuderia e : escuderias){
            relatorio += e.informacoesEscuderia();
        }
        return relatorio;
    }
    
    public static void adicionarEscuderia(Escuderia e){
        escuderias.add(e);
    }
    
    public static void iniciarCampeonato() throws InterruptedException{
        Campeonato campeonato1 = new Campeonato(corridas, escuderias);
        campeonato1.IniciarCampeonato();
    }
}
