package classes;


import java.util.ArrayList;



/**
 * Class Corrida
 */
public class Corrida {

  //
  // Fields
  //

  private ArrayList<Carro> posicoes = new ArrayList<>();
  private boolean chuva = false;
  private String cidade;
  
  //
  // Constructors
  //
  public Corrida () { };
  public Corrida (String nome){
      cidade = nome;
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
    posicoes.add(newVar);
  }

  /**
   * Get the value of posicoes
   * @return the value of posicoes
   */
  public ArrayList<Carro> getPosicoes () {
    return posicoes;
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

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
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


}
