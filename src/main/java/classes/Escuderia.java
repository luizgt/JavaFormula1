package classes;


import classes.Mecanico;
import java.util.ArrayList;



/**
 * Class Escuderia
 */
public class Escuderia {

  //
  // Fields
  //
  private String nomeEscuderia;
  private short posicaoCampeonato = 0;
  private ArrayList<Engenheiro> engenheiros = new ArrayList<>();
  private ArrayList<Mecanico> mecanicos = new ArrayList<>();
  private ArrayList<Piloto> pilotos = new ArrayList<>();
  private ArrayList<Carro> carros = new ArrayList<>();
  
  //
  // Constructors
  //
  public Escuderia (String nome){ 
      nomeEscuderia = nome;
  };
  
  public Escuderia(){
      
  }
  
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
    engenheiros.add(newVar);
  }

  /**
   * Get the value of engenheiros
   * @return the value of engenheiros
   */
  public ArrayList<Engenheiro> getEngenheiros () {
    return engenheiros;
  }

  /**
   * Set the value of mecanicos
   * @param newVar the new value of mecanicos
   */
  public void setMecanicos (Mecanico newVar) {
    mecanicos.add(newVar);
  }

  /**
   * Get the value of mecanicos
   * @return the value of mecanicos
   */
  public ArrayList<Mecanico> getMecanicos () {
    return mecanicos;
  }

  /**
   * Set the value of pilotos
   * @param newVar the new value of pilotos
   */
  public void setPilotos (Piloto newVar) {
    pilotos.add(newVar);
  }

  /**
   * Get the value of pilotos
   * @return the value of pilotos
   */
  public ArrayList<Piloto> getPilotos () {
    return pilotos;
  }

  /**
   * Set the value of carros
   * @param newVar the new value of carros
   */
  public void setCarros (Carro newVar) {
    carros.add(newVar);
  }

  /**
   * Get the value of carros
   * @return the value of carros
   */
  public ArrayList<Carro> getCarros () {
    return carros;
  }

  public String getNomeEscuderia() {
    return nomeEscuderia;
  }

  public void setNomeEscuderia(String nomeEscuderia) {
    this.nomeEscuderia = nomeEscuderia;
  }
  
  

  //
  // Other methods
  //
  
  public boolean adicionarEngenheiros(Engenheiro newEngenheiro){
      if(engenheiros.size() > 2) return false;
      else {
          setEngenheiros(newEngenheiro);
          return true;
      }
      
  }
  
  public boolean adicionarMecanicos(Mecanico newMecanico){
      if(mecanicos.size() > 4) return false;
      else {
          setMecanicos(newMecanico);
          return true;
      }
  }
  
  public boolean adicionarPilotos(Piloto newPiloto){
      if(pilotos.size() > 2) return false;
      else {
          setPilotos(newPiloto);
          return true;
      }
  }
  
  public void adicionarCarros(Carro newCarro){
      setCarros(newCarro);
  }
  
  public String informacoesEscuderia(){
      String resultado = "";
      resultado = nomeEscuderia + "\n----------------------------\n";
      
      resultado += "Engenheiros: ";
      for(int i = 0; i < engenheiros.size(); i++){
          resultado += "\n" + engenheiros.get(i).getNome();
      }
      resultado += "\n----------------------------";
      resultado += "\nMecânicos: ";
      for(int i = 0; i < mecanicos.size(); i++){
          resultado += "\n" + mecanicos.get(i).getNome();
      }
      resultado += "\n----------------------------";
      resultado += "\nCarros: ";
      for(int i = 0; i < carros.size(); i++){
          resultado += "\n" + carros.get(i).getIdCarro() +" " + carros.get(i).getCombustivel();
      }
      resultado += "\n----------------------------";
      resultado += "\nPilotos: ";
      for(int i = 0; i < pilotos.size(); i++){
          resultado += "\n" + pilotos.get(i).getNome();
      }
      
      return resultado;
  }

}
