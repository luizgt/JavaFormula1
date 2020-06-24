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
  public static void trocarPneus(){
      
  }


  /**
   * Return a new quantity of gasoline
   * @return the value of new gasoline
   */
  public static int abastecerCarro(){
      System.out.println("Mecânico abasteceu o carro!");
      return 150;
  }


}
