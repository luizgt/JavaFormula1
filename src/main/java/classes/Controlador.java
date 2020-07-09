/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import UI.uiPrincipal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giulia
 */
public class Controlador {
    private static ArrayList <Corrida> corridas = new ArrayList<>();      
    private static ArrayList <Escuderia> escuderias = new ArrayList<>();
    
    public Controlador(){
        corridas.add(new Corrida("GP São Paulo", 99));
        corridas.add(new Corrida("GP Londres", 120));
        corridas.add(new Corrida("GP Tokio", 120));
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
        escuderia.adicionarPilotos(new Piloto("Luiz"));
        escuderia.adicionarPilotos(new Piloto("Giulia"));
        
    }
    
    private static void settingMecanicos(Escuderia escuderia){
        escuderia.adicionarMecanicos(new Mecanico("Marcelo"));
        escuderia.adicionarMecanicos(new Mecanico("Carlos"));
        escuderia.adicionarMecanicos(new Mecanico("Paula"));
        escuderia.adicionarMecanicos(new Mecanico("Maria"));
    }
    
    private static void settingEngenheiros(Escuderia escuderia){
       escuderia.adicionarEngenheiros(new Engenheiro("William"));
       escuderia.adicionarEngenheiros(new Engenheiro("Beatriz"));
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
    
    public void adicionarEscuderia(Escuderia e){
        escuderias.add(e);
    }
    
    public void iniciarCampeonato() throws InterruptedException{
        Campeonato campeonato1 = new Campeonato(corridas, escuderias);
        campeonato1.IniciarCampeonato();
    }
    
    public void escreverNaTela(String texto){
        try {
            Thread.sleep(50);
            uiPrincipal.setTextLog(texto);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String resultadoCampeonato(){
        String resultado = "";
        int aux = corridas.size();
        Corrida corrida = corridas.get(aux - 1);
        resultado = corrida.getResultado();
//        System.out.println("Cidade" + corrida.getCidade());
//        for(Carro c : corrida.getCarros()){
//            resultado += "\nCarro: " + c.getEscuderia() + " " + c.getIdCarro() + " ptos: " + c.getQtdPontosNoCampeonato();
//        }
//        for(Corrida corrida : corridas){
//            //resultado += "\nCorrida: " + corrida.getCidade();
//            ArrayList<Carro> carros = corrida.getCarros();
//            for(Carro c : carros ){
//                resultado += "\nCarro: " + c.getEscuderia() + " " + c.getIdCarro() + " ptos: " + c.getQtdPontosNoCampeonato();
//            }
//            resultado += "\n---------------\n";
//        }
        return resultado;
    }
}
