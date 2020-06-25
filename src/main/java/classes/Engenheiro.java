package classes;



/**
 * Class Engenheiro
 */
public class Engenheiro extends funcionario{

    public Engenheiro(String newNome) {
        super(newNome);
    }
  
  
  
  /**
   */
  public static void chamarTrocaDePneu(String equipe, int id){
      Mecanico.trocarPneus(equipe, id);
  }


  /**
   */
  public void chamarAbastecimento(){
  }


  /**
   */
  public static void trocarPosicao(String equipe){
      System.out.println("Trocar posições equipe " + equipe);
  }

  public static void acidenteNaPista(String equipe, int id){
      Mecanico.acidenteCarro(equipe, id);
  }
  
  public static void chamarPitstop(String equipe, int id){
      Mecanico.pitstop(equipe, id);
  }
  
  public static void chamarReparoCarro(String equipe, int id){
      Mecanico.carroQuebrado(equipe, id);
  }
}
