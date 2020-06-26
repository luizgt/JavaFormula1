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

  private Status status = null;
  private int id;
  private String equipe;
  private int voltaAtual;
  private int qtdVoltas;
  private float combustivel;
  private int posicaoAtual;
  private static int proximaPosicao = 1;
  private int evento; //(0)nenhum (2)Em acidente (3)Pitstop (4)Quebrado (5)Trocar posição
  private boolean chuva = false;
  
  //
  // Constructors
  //
  public Carro (int newId, String escuderia, float newCombustivel) { 
      id = newId;
      equipe = escuderia;
      voltaAtual = 0;
      combustivel = newCombustivel;
      posicaoAtual = 0;
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
   * Set the value of equipe
   * @param newVar the new value of equipe
   */
  public void setEquipe (String newVar) {
    equipe = newVar;
  }

  /**
   * Get the value of equipe
   * @return the value of equipe
   */
  public String getEquipe () {
    return equipe;
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
   * Set the proxima posicao
   * @param proxPosicao the new value of proximaPosicao
   */
  public static void setProximaPosicao(int proxPosicao) {
    Carro.proximaPosicao = proxPosicao;
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
            System.out.println("Carro "+id+" da equipe "+equipe+" parou para abastecer!");
            combustivel = Mecanico.abastecerCarro();
        }
        
        if(evento == 1){ //Está chovendo
            if(!chuva){ //Se ainda não estava chovendo, agora está
                chuva = true;
                Engenheiro.chamarTrocaDePneu(equipe, id);
            }
            evento = 0; //Volta para 0 o evento
        }
        
        if(evento == 2){ //Carro envolvido em acidente
            Engenheiro.acidenteNaPista(equipe, id);
            evento = 0;
        }
        
        if(evento == 3){ //Carro no pitstop
            Engenheiro.chamarPitstop(equipe, id);
            evento = 0;
        }
        
        if(evento == 4){ //Carro quebrado
            Engenheiro.chamarReparoCarro(equipe, id);
            evento = 0;
        }
        
        if(evento == 5){
            Engenheiro.trocarPosicao(equipe);
            evento = 0;
        }
        
    }
    posicaoAtual = proximaPosicao;  //carro finaliza a corrida e recebe a posicao disponivel
    proximaPosicao++;   //atualiza a posicao para o proximo a finalizar a corrida
    System.out.println("Carro "+id+" da equipe "+equipe+" terminou na posição: "+posicaoAtual+"!");
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
