

/**
 * Class Campeonato
 */
public class Campeonato {

  //
  // Fields
  //

  private int qtdCorridas;
  private int corridaAtual;
  private Escuderia escuderias;
  private Corrida corridas;
  
  //
  // Constructors
  //
  public Campeonato () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of qtdCorridas
   * @param newVar the new value of qtdCorridas
   */
  public void setQtdCorridas (int newVar) {
    qtdCorridas = newVar;
  }

  /**
   * Get the value of qtdCorridas
   * @return the value of qtdCorridas
   */
  public int getQtdCorridas () {
    return qtdCorridas;
  }

  /**
   * Set the value of corridaAtual
   * @param newVar the new value of corridaAtual
   */
  public void setCorridaAtual (int newVar) {
    corridaAtual = newVar;
  }

  /**
   * Get the value of corridaAtual
   * @return the value of corridaAtual
   */
  public int getCorridaAtual () {
    return corridaAtual;
  }

  /**
   * Set the value of escuderias
   * @param newVar the new value of escuderias
   */
  public void setEscuderias (Escuderia newVar) {
    escuderias = newVar;
  }

  /**
   * Get the value of escuderias
   * @return the value of escuderias
   */
  public Escuderia getEscuderias () {
    return escuderias;
  }

  /**
   * Set the value of corridas
   * @param newVar the new value of corridas
   */
  public void setCorridas (Corrida newVar) {
    corridas = newVar;
  }

  /**
   * Get the value of corridas
   * @return the value of corridas
   */
  public Corrida getCorridas () {
    return corridas;
  }

  //
  // Other methods
  //

}
