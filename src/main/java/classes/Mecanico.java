package classes;


/**
 * Class Mecanico
 */
public class Mecanico extends funcionario{

    
    public Mecanico(String newNome) {
        super(newNome);
    }
    

  //
  // Other methods
  //

  /**
   * Report troca de pneus.
   * @return A String sobre a troca de pneu.
   */
  public static String trocarPneus(String equipe, int id){
      return ("\nPneus trocados para chuva equipe: " + equipe + " " + id);
  }


  /**
   * Return a new quantity of gasoline
   * @return the value of new gasoline
   */
  public static int abastecerCarro(){
      return 150;
  }
  
  /**
   * Retorna uma mensagem sobre carros consertados.
   * @return String com mensagem sobre conserto.
   */
  public static String acidenteCarro(String equipe, int id){
      return ("\nCarro " + equipe + " " + id + " consertado");
  }
  
  /**
   * Retorna uma mensagem sobre carro parado no pitstop.
   * @return String com mensagem sobre parada no pitstop.
   */
  public static String pitstop(String equipe, int id){
      return ("\nCarro " + equipe + " " + id + " no pitstop");
  }
  
  /**
   * Retorna uma mensagem sobre o carro quebrado.
   * @param equipe
   * @param id
   * @return String com a mensagem sobre carro quebrado.
   */
  public static String carroQuebrado(String equipe, int id){
      return ("\nCarro " + equipe + " " + id + " quebrado");
  }


}
