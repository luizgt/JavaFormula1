package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 * Class Carro
 */
public class Carro implements Runnable{

  //
  // Fields
  //

  private Status status = null; //Status do carro, se esta correndo, pitstop ou terminou a corrida
  private int id;
  private String escuderia;
  private int voltaAtual;
  private int qtdVoltas;
  private float combustivel;
  private int posicaoAtual;
  private static int proximaPosicao = 1;
  private int evento; //(0)nenhum (2)Em acidente (3)Pitstop (4)Quebrado (5)Trocar posição
  private boolean chuva = false;
  private short qtdPontosNoCampeonato;

  
  //
  // Constructors
  //
  public Carro (int newId, String escuderia, float newCombustivel) { 
      id = newId;
      this.escuderia = escuderia;
      voltaAtual = 0;
      combustivel = newCombustivel;
      posicaoAtual = 0;
      qtdPontosNoCampeonato = 0;
  };
  
  public Carro (String escuderia, int newId, int posicaoAtual) { 
      this.id = newId;
      this.escuderia = escuderia;
      this.posicaoAtual = posicaoAtual;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of status
   * @param newVar the new value of status
   */
  public void setStatus (Status newVar) {
    status = newVar;
  }

  /**
   * Get the value of status
   * @return the value of status
   */
  public Status getStatus () {
    return status;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getIdCarro () {
    return id;
  }

  /**
   * Set the value of escuderia
   * @param newVar the new value of escuderia
   */
  public void setEscuderia (String newVar) {
    escuderia = newVar;
  }

  /**
   * Get the value of escuderia
   * @return the value of escuderia
   */
  public String getEscuderia () {
    return escuderia;
  }

  /**
   * Set the value of voltaAtual
   * @param newVar the new value of voltaAtual
   */
  public void setVoltaAtual (int newVar) {
    voltaAtual = newVar;
  }

  /**
   * Get the value of voltaAtual
   * @return the value of voltaAtual
   */
  public int getVoltaAtual () {
    return voltaAtual;
  }

  /**
   * Set the value of combustivel
   * @param newVar the new value of combustivel
   */
  public void setCombustivel (float newVar) {
    combustivel = newVar;
  }

  /**
   * Get the value of combustivel
   * @return the value of combustivel
   */
  public float getCombustivel () {
    return combustivel;
  }
  
  /**
   * Set the value of posicaoAtual
   * @param posicaoAtual the new value of posicaoAtual
   */
  public void setPosicaoAtual(int posicaoAtual) {
    this.posicaoAtual = posicaoAtual;
  }
  
  /**
   * Get the value of posicaoAtual
   * @return the value of posicaoAtual
   */
  public int getPosicaoAtual() {
    return posicaoAtual;
  }

  /**
   * Set the value of qtdVoltas
   * @param newVar the new value of qtdVoltas
   */
  public void setQtdVoltas (int newVar) {
    qtdVoltas = newVar;
  }

  /**
   * Get the value of qtdVoltas
   * @return the value of qtdVoltas
   */
  public int getqtdVoltas () {
    return qtdVoltas;
  }

  /**
   * Get the evento
   * @return the evento
   */
  public int getEvento() {
    return evento;
  }

  /**
   * Set the evento
   * @param evento the new value of evento
   */
  public void setEvento(int evento) {
    this.evento = evento;
  }
  
  /**
   * Set the chuva
   * @return the chuva
   */
  public boolean isChuva() {
    return chuva;
  }
  
  /**
   * Set the chuva
   * @param chuva the new value of chuva
   */
  public void setChuva(boolean chuva) {
    this.chuva = chuva;
  }
  
  /**
   * Set the proxima posicao
   * @param proxPosicao the new value of proximaPosicao
   */
  public static void setProximaPosicao(int proxPosicao) {
    Carro.proximaPosicao = proxPosicao;
  }
  
  /**
   * Set the value of qtdPontosNoCampeonato
   * @param newVar the new value of qtdPontosNoCampeonato
   */
  public void setQtdPontosNoCampeonato (short newVar) {
    qtdPontosNoCampeonato = newVar;
  }

  /**
   * Get the value of qtdPontosNoCampeonato
   * @return the value of qtdPontosNoCampeonato
   */
  public short getQtdPontosNoCampeonato () {
    return qtdPontosNoCampeonato;
  }
  
  
  //
  // Other methods
  //
  
  @Override
  public void run(){
    for(voltaAtual = 0; voltaAtual < qtdVoltas; voltaAtual++){
//        System.out.println(equipe + " | " + (voltaAtual+1) + " | Combustível: " + combustivel);
        
        combustivel -= 2;   //gastando combustivel a cada volta
        if(combustivel <= 0){
            System.out.println("Carro "+id+" da equipe "+escuderia+" parou para abastecer!");
            combustivel = Mecanico.abastecerCarro();
        }
        
        if(evento == 1){ //Está chovendo
            if(!chuva){ //Se ainda não estava chovendo, agora está
                status.setPitstop(true);
                chuva = true;
                Engenheiro.chamarTrocaDePneu(escuderia, id);
                status.setPitstop(false);
            }
            evento = 0; //Volta para 0 o evento
        }
        
        if(evento == 2){ //Carro envolvido em acidente
            status.setPitstop(true);
            Engenheiro.acidenteNaPista(escuderia, id);
            evento = 0;
            status.setPitstop(false);
        }
        
        if(evento == 3){ //Carro no pitstop
            status.setPitstop(true);
            Engenheiro.chamarPitstop(escuderia, id);
            evento = 0;
            status.setPitstop(false);
        }
        
        if(evento == 4){ //Carro quebrado
            status.setPitstop(true);
            Engenheiro.chamarReparoCarro(escuderia, id);
            evento = 0;
            status.setPitstop(false);
        }
        
        if(evento == 5){ //Troca de posição
            Engenheiro.trocarPosicao(escuderia);
            evento = 0;
        }
        
    }
    posicaoAtual = proximaPosicao;  //carro finaliza a corrida e recebe a posicao disponivel
    proximaPosicao++;   //atualiza a posicao para o proximo a finalizar a corrida
    status.setTerminouCorrida(true);
    status.setCorrendo(false);
    //System.out.println("Carro "+id+" da equipe "+equipe+" terminou na posição: "+posicaoAtual+"!");
  }
  
  /**
   * Retorna os carros ordenados de acordo com suas posições.
   * @param carros
   * @return 
   */
  public static ArrayList <Carro> ordenarCarros(ArrayList <Carro> carros){
      Collections.sort(carros, new compararPosicoes());
      return carros;
  }

  private static class compararPosicoes implements Comparator <Carro>{
      @Override
      public int compare(Carro c1, Carro c2){
          if (c1.getPosicaoAtual() < c2.getPosicaoAtual())
            return -1;
          else return 1;
      }
  }
  
}
