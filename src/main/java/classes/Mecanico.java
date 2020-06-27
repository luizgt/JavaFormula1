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
   */
  public static void trocarPneus(String equipe, int id){
      System.out.println("Pneus trocados para chuva equipe: " + equipe + " " + id);
  }


  /**
   * Return a new quantity of gasoline
   * @return the value of new gasoline
   */
  public static int abastecerCarro(){
      System.out.println("Mecânico abasteceu o carro!");
      return 150;
  }
  
  public static void acidenteCarro(String equipe, int id){
      System.out.println("Carro " + equipe + " " + id + " consertado");
  }
  
  public static void pitstop(String equipe, int id){
      System.out.println("Carro " + equipe + " " + id + " no pitstop");
  }
  
  public static void carroQuebrado(String equipe, int id){
      System.out.println("Carro " + equipe + " " + id + " quebrado");
  }


}
