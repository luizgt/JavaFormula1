

/**
 * Class Escuderia
 */
public class Escuderia {

  //
  // Fields
  //

  private short posicaoCampeonato = 0;
  private Engenheiro engenheiros;
  private Mecanico mecanicos;
  private Piloto pilotos;
  private Carro carros;
  
  //
  // Constructors
  //
  public Escuderia () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of posicaoCampeonato
   * @param newVar the new value of posicaoCampeonato
   */
  public void setPosicaoCampeonato (short newVar) {
    posicaoCampeonato = newVar;
  }

  /**
   * Get the value of posicaoCampeonato
   * @return the value of posicaoCampeonato
   */
  public short getPosicaoCampeonato () {
    return posicaoCampeonato;
  }

  /**
   * Set the value of engenheiros
   * @param newVar the new value of engenheiros
   */
  public void setEngenheiros (Engenheiro newVar) {
    engenheiros = newVar;
  }

  /**
   * Get the value of engenheiros
   * @return the value of engenheiros
   */
  public Engenheiro getEngenheiros () {
    return engenheiros;
  }

  /**
   * Set the value of mecanicos
   * @param newVar the new value of mecanicos
   */
  public void setMecanicos (Mecanico newVar) {
    mecanicos = newVar;
  }

  /**
   * Get the value of mecanicos
   * @return the value of mecanicos
   */
  public Mecanico getMecanicos () {
    return mecanicos;
  }

  /**
   * Set the value of pilotos
   * @param newVar the new value of pilotos
   */
  public void setPilotos (Piloto newVar) {
    pilotos = newVar;
  }

  /**
   * Get the value of pilotos
   * @return the value of pilotos
   */
  public Piloto getPilotos () {
    return pilotos;
  }

  /**
   * Set the value of carros
   * @param newVar the new value of carros
   */
  public void setCarros (Carro newVar) {
    carros = newVar;
  }

  /**
   * Get the value of carros
   * @return the value of carros
   */
  public Carro getCarros () {
    return carros;
  }

  //
  // Other methods
  //

}
