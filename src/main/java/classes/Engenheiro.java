package classes;



/**
 * Class Engenheiro
 */
public class Engenheiro extends funcionario{

    public Engenheiro(String newNome) {
        super(newNome);
    }
  
  
  
  /**
   * Retorna Mensagem sobre a troca de pneus.
     * @param equipe
     * @param id
   * @return String com a mensagem sobre a troca de pneus.
   */
  public static String chamarTrocaDePneu(String equipe, int id){
      return Mecanico.trocarPneus(equipe, id);
  }

  /**
   * Retorna mensagem sobre a troca de posições dos veículos.
   * @param equipe
   * @return String sobre troca de posicoes
   */
  public static String trocarPosicao(String equipe){
      return ("Trocar posições equipe " + equipe);
//      System.out.println("Trocar posições equipe " + equipe);
  }

  /**
   * Retorna Mensagem sobre manutenção de carros.
   * @param equipe nome da equipe.
   * @param id id do carro envolvido.
   * @return String com a mensagem sobre a manutenção de carro.
   */
  public static String acidenteNaPista(String equipe, int id){
      return Mecanico.acidenteCarro(equipe, id);
  }
  
  /**
   * Retorna mensagem sobre a parada de carro no pitstop.
   * @param equipe
   * @param id 
   * @return String sobre a parada no pitstop.
   */
  public static String chamarPitstop(String equipe, int id){
      return Mecanico.pitstop(equipe, id);
  }
  
  /**
   * Retorna mensagem sobre quebra de carro.
   * @param equipe
   * @param id
   * @return String sobre a quebra.
   */
  public static String chamarReparoCarro(String equipe, int id){
      return Mecanico.carroQuebrado(equipe, id);
  }
}
