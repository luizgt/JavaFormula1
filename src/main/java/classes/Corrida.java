package classes;


import java.util.ArrayList;



/**
 * Class Corrida
 */
public class Corrida{

  //
  // Fields
  //

  private ArrayList<Carro> carros;
  private boolean chuva = false;
  private String cidade;
  private int qtdVoltas;
  
  //
  // Constructors
  //
  public Corrida () { };
  public Corrida (String nomeCidade, int qtdVoltas, ArrayList<Carro> carros){
      cidade = nomeCidade;
      this.qtdVoltas = qtdVoltas;
      this.carros = carros;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of posicoes
   * @param newVar the new value of posicoes
   */
  public void setPosicoes (Carro newVar) {
    carros.add(newVar);
  }

  /**
   * Get the value of posicoes
   * @return the value of posicoes
   */
  public ArrayList<Carro> getPosicoes () {
    return carros;
  }

  /**
   * Set the value of chuva
   * @param newVar the new value of chuva
   */
  public void setChuva (boolean newVar) {
    chuva = newVar;
  }
  
 /**
   * Get the value of chuva
   * @return the value of chuva
   */
  public boolean getChuva () {
    return chuva;
  }
  
  /**
   * Set the value of chuva
   * @param newVar the new value of cidade
   */
  public void setCidade(String newVar) {
    this.cidade = newVar;
  }
  
   /**
   * Get the value of cidade
   * @return the value of cidade
   */
  public String getCidade() {
    return cidade;
  }
  
  /**
   * Set the value of chuva
   * @param newVar the new value of qtdVoltas
   */
  public void setQtdVoltas (int newVar) {
    qtdVoltas = newVar;
  }

 /**
   * Get the value of qtdVoltas
   * @return the value of qtdVoltas
   */  
  public int getQtdVoltas(){
     return qtdVoltas;
  }
  
  //
  // Other methods
  //

  /**
   */
  public void quebrarCarro(){
  }


  /**
   */
  private void comecarChover(){
  }


  /**
   */
  private void acidente(){
  }

  public void largada(){
      for (Carro c : carros) {  //setando a quantidade de voltas para cada carro
          c.setQtdVoltas(qtdVoltas);
      }
      
      for (Carro c : carros) {  //iniciando as threads
          c.start();
      }
  }

}
