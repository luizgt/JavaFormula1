

/**
 * Class Carro
 */
public class Carro {

  //
  // Fields
  //

  private Status status = null;
  private int id;
  private String equipe;
  private int voltaAtual;
  private float combustivel;
  
  //
  // Constructors
  //
  public Carro () { };
  
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
  public int getId () {
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

  //
  // Other methods
  //

}
