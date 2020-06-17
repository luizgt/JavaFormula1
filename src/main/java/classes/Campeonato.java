package classes;


import java.util.ArrayList;



/**
 * Class Campeonato
 */
public class Campeonato {

  //
  // Fields
  //

  private int qtdCorridas;
  private int corridaAtual = 0;
  private ArrayList <Escuderia> escuderias = new ArrayList <>();
  private ArrayList <Corrida> corridas = new ArrayList<>();
  
  //
  // Constructors
  //
  public Campeonato () { };
  
  public Campeonato(Corrida newCorrida){
      qtdCorridas = 1;
      setCorridas(newCorrida);
  }
  
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
    escuderias.add(newVar);
  }

  /**
   * Get the value of escuderias
   * @return the value of escuderias
   */
  public ArrayList<Escuderia> getEscuderias () {
    return escuderias;
  }

  /**
   * Set the value of corridas
   * @param newVar the new value of corridas
   */
  public void setCorridas (Corrida newVar) {
    corridas.add(newVar);
  }

  /**
   * Get the value of corridas
   * @return the value of corridas
   */
  public ArrayList<Corrida> getCorridas () {
    return corridas;
  }

  //
  // Other methods
  //
  
  public void adicionarEscuderias(Escuderia newEscuderia){
      setEscuderias(newEscuderia);
  }
  
  public void adicionarCorridas(Corrida newCorrida){
      setCorridas(newCorrida);
      qtdCorridas++;
  }
  
  public String informacoesCampeonato(){
    String resultado = "";
    resultado += "----------------------------\n";
    
    resultado += "\nEscuderias: ";
    for(int i = 0; i < escuderias.size(); i++){
          resultado += "\n" + escuderias.get(i).getNomeEscuderia();
    }
    
    resultado += "\n----------------------------";
    for(int i = 0; i < corridas.size(); i++){
        resultado += "\n" + corridas.get(i).getCidade();
    }
    
    resultado += "\n----------------------------" + "\nQuantidade de corridas: " + qtdCorridas + "\nCorrida atual: " + corridaAtual;
      
      return resultado;
  }

}
