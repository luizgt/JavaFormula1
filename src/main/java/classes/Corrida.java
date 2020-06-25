package classes;


import java.util.ArrayList;
import java.util.Random;



/**
 * Class Corrida
 */
public class Corrida extends Thread{

  //
  // Fields
  //

  private ArrayList<Carro> carros;
  private boolean chuva = false;
  private String cidade;
  private int qtdVoltas;
  private int voltaAtual;
  
  //
  // Constructors
  //
  public Corrida () { };
  public Corrida (String nomeCidade, int qtdVoltas, ArrayList<Carro> carros){
      cidade = nomeCidade;
      this.qtdVoltas = qtdVoltas;
      this.carros = carros;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of posicoes
   * @param newVar the new value of posicoes
   */
  public void setPosicoes (Carro newVar) {
    carros.add(newVar);
  }

  /**
   * Get the value of posicoes
   * @return the value of posicoes
   */
  public ArrayList<Carro> getPosicoes () {
    return carros;
  }

  /**
   * Set the value of chuva
   * @param newVar the new value of chuva
   */
  public void setChuva (boolean newVar) {
    chuva = newVar;
  }
  
 /**
   * Get the value of chuva
   * @return the value of chuva
   */
  public boolean getChuva () {
    return chuva;
  }
  
  /**
   * Set the value of chuva
   * @param newVar the new value of cidade
   */
  public void setCidade(String newVar) {
    this.cidade = newVar;
  }
  
   /**
   * Get the value of cidade
   * @return the value of cidade
   */
  public String getCidade() {
    return cidade;
  }
  
  /**
   * Set the value of chuva
   * @param newVar the new value of qtdVoltas
   */
  public void setQtdVoltas (int newVar) {
    qtdVoltas = newVar;
  }

 /**
   * Get the value of qtdVoltas
   * @return the value of qtdVoltas
   */  
  public int getQtdVoltas(){
     return qtdVoltas;
  }
  
  //
  // Other methods
  //  

  public void largada(){
      for (Carro c : carros) {  //setando a quantidade de voltas para cada carro
          c.setQtdVoltas(qtdVoltas);
      }
      
      for (Carro c : carros) {  //iniciando as threads
          c.start();
      }
      run(); //Uma thread em paralelo que controla os eventos
  }
  
  @Override
    public void run(){
        
        for(voltaAtual = 0; voltaAtual < qtdVoltas; voltaAtual++){
            Random random = new Random();
      
            int e = random.nextInt(70); 
            //Soteia de 1 a 70, quanto maior esse número menor a probabilidade de eventos
            //Sorteia um evento que pode ser: (1) Chuva (2)Acidente (3)Pitstop (4)Quebrar Carro
            //(5) Trocar de posição (>6)Nenhum
            int idCarro = random.nextInt(carros.size()); //Sorteia um doa carros
            int idCarro2 = random.nextInt(carros.size()); //Sorteia outro carro, caso seja necessário

            switch(e){
              case 1: //Chuva para todos
                  if(!chuva){ //Se ainda não estava chovendo, agora está chovendo
                      System.out.println("Começou a chover");
                    for(Carro c: carros){
                        c.setEvento(1);
                    }
                  }
                  chuva = true;
                  break;
              case 2: //Acidente com 2 carros
                  //Carros em acidente são trocados ou retirados da corrida (??)
                  //Por enquanto os carros estão sendo "substituídos" 
                  System.out.println("Um acidente na pista");
                  carros.get(idCarro).setEvento(2);
                  carros.get(idCarro2).setEvento(2);
                  break;
              case 3: //Carro no pitstop
                  carros.get(idCarro).setEvento(3);
                  break;
              case 4: //Carro quebrado
                  carros.get(idCarro).setEvento(4);
                  break;
              case 5:
                  carros.get(idCarro).setEvento(5);
                  break;
              default:
                  break;

            }
        }  
    }

}
