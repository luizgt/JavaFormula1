

/**
 * Class Corrida
 */
public class Corrida {

  //
  // Fields
  //

  private Carro posicoes;
  private boolean chuva = false;
  
  //
  // Constructors
  //
  public Corrida () { };
  
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
    posicoes = newVar;
  }

  /**
   * Get the value of posicoes
   * @return the value of posicoes
   */
  public Carro getPosicoes () {
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

  //
  // Other methods
  //

  /**
   */
  public void quebrarCarro()
  {
  }


  /**
   */
  private void comecarChover()
  {
  }


  /**
   */
  private void acidente()
  {
  }


}
