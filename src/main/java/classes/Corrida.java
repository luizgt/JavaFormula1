package classes;

import UI.uiPrincipal;
import java.util.ArrayList;
import java.util.Random;



/**
 * Class Corrida
 */
public class Corrida extends Thread{

  //
  // Fields
  //

  private ArrayList<Carro> carros = new ArrayList <>();
  private boolean chuva = false;
  private String cidade;
  private int qtdVoltas;
  private int voltaAtual;
  private String resultado = "";
  
  //
  // Constructors
  //
  public Corrida () { };
  public Corrida (String nomeCidade, int qtdVoltas, ArrayList<Carro> carros){
      cidade = nomeCidade;
      this.qtdVoltas = qtdVoltas;
      this.carros = carros;
  }
  
  public Corrida (String nomeCidade, int qtdVoltas){
      cidade = nomeCidade;
      this.qtdVoltas = qtdVoltas;
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
  public void setPosicoes (ArrayList <Carro> newVar) {
      carros = (ArrayList) newVar.clone();
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

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

//    public String getResultado() {
//        return resultado;
//    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
  
  
  
  //
  // Other methods
  //  

  
  /**
   * Inicia a corrida e retorna a posicao dos carros 
     * @param carrosDaCorrida Carro - ArrayList de Carros
     * @throws java.lang.InterruptedException
   */
  public void largada(ArrayList <Carro> carrosDaCorrida) throws InterruptedException{   
    this.carros = carrosDaCorrida;

    uiPrincipal.sistema.escreverNaTela("\n> Iniciando corrida "+cidade+"\n");

    Carro.setProximaPosicao(1);       //resetando o atributo static das posicoes
    boolean correndo = true;
    boolean fim = false;
    Status s = new Status(correndo, fim);
    chuva = false; //Ainda não está chovendo

    for (Carro c : carrosDaCorrida){  //preparando as corridas 
        c.setQtdVoltas(qtdVoltas);    //setando a quantidade de voltas para cada carro
        c.setEvento(0);               //Setando o evento para 0 de novo
        c.setChuva(false);            //Setando que não está chovendo
        c.setStatus(s);               //Setando status do carro
    }

    for (Carro c : carrosDaCorrida) {  //disparando as threads
        Thread td = new Thread(c);
        td.start();
    }

    run(); //Uma thread em paralelo que controla os eventos
    Thread.sleep(1000);    //garantindo que todos os carros terminaram a corrida antes de ordena-los     

    carrosDaCorrida = Carro.ordenarCarrosNaCorrida(carrosDaCorrida);
    uiPrincipal.sistema.escreverNaTela("\n\n> Corrida "+cidade+" finalizada!\n");

    for(Carro c : carros){
        short pontuacao = c.getQtdPontosNoCampeonato();
        short novaPto = retornarPontosDaCorrida(c);
        c.setQtdPontosNoCampeonato((short)(pontuacao + novaPto));
    }

    this.carros = copiarCarros(carrosDaCorrida);  //guardando resultado da corrida na Corrida
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
                    uiPrincipal.sistema.escreverNaTela("\nComeçou a chover!");
                    for(Carro c: carros) 
                        c.setEvento(1);
                  }
                  chuva = true;
                  break;
              case 2: //Acidente com 2 carros - Verifica se os carros ainda estão correndo
                  //Carros em acidente são trocados ou retirados da corrida (??)
                  //Por enquanto os carros estão sendo "substituídos" 
                  if((carros.get(idCarro).getStatus().isCorrendo())&&(carros.get(idCarro2).getStatus().isCorrendo())){
                    uiPrincipal.sistema.escreverNaTela("\nUm acidente na pista " + carros.get(idCarro).getEscuderia() + " " + carros.get(idCarro).getIdCarro() +  " e " + carros.get(idCarro2).getEscuderia() + " " + carros.get(idCarro2).getIdCarro());
                    carros.get(idCarro).setEvento(2);
                    carros.get(idCarro2).setEvento(2);
                  }
                  break;
              case 3: //Carro no pitstop - Verifica se o carro ainda está na corrida
                  if(carros.get(idCarro).getStatus().isCorrendo())
                    carros.get(idCarro).setEvento(3);
                  break;
              case 4: //Carro quebrado - Verifica se o carro ainda está na corrida
                  if(carros.get(idCarro).getStatus().isCorrendo())
                      carros.get(idCarro).setEvento(4);
                  break;
              case 5: //Troca de posição - Verifica se os carros ainda estão na corrida
                  String equipe = carros.get(idCarro).getEscuderia();
                  Carro c1 = carros.get(idCarro);
                  Carro c2 = null;

                  for(Carro c : carros)
                    if(c.getEscuderia().equals(equipe) && c1.getIdCarro() != c.getIdCarro()) //Carros precisam ser da mesma equipe
                        c2 = c;
                  
                   if((c2.getStatus().isCorrendo())&&(c1.getStatus().isCorrendo()))
                    carros.get(idCarro).setEvento(5);
                  break;
              default: break;
            }
        }  
    }
    
    /**
     * Retorna uma cópia profunta do ArrayList passado por parâmetro
     * @param copiar
     * @return Uma cópia profunda de copiar
     */
    private static ArrayList <Carro> copiarCarros(ArrayList <Carro> copiar){
        ArrayList <Carro> copia = new ArrayList<>();
        
        for(Carro carroCopiar : copiar){
            Carro carroAux = new Carro(carroCopiar.getEscuderia(),
                                        carroCopiar.getIdCarro(),
                                        carroCopiar.getPosicaoAtual());
            copia.add(carroAux);
        }
        
        return copia;
    }
    
    /**
     * Retorna a quantidade de pontos em relação à posição na corrida.
     * @param c
     * @return 
     */
    public static short retornarPontosDaCorrida(Carro c){
        switch (c.getPosicaoAtual()){
            case 1: return 25;
            case 2: return 18;
            case 3: return 15;
            case 4: return 12;
            case 5: return 10;
            case 6: return 8;
            case 7: return 6;
            case 8: return 4;
            case 9: return 2;
            case 10: return 1;
            default: return 0;
        }
    }

    /**
     * Retorna o resultado da corrida.
     * @return String - Resultado da Corrida.
     */
    public String retornarResultado(){
        String retorno = "";
        ArrayList <Carro> cpCarros = carros;
        cpCarros = Carro.ordenarCarrosNoCampeonato(cpCarros);
        
        for(Carro c : cpCarros)
            retorno += "\nCarro: " + c.getEscuderia() + " " + c.getIdCarro() + " ptos: " + c.getQtdPontosNoCampeonato();
        return retorno;
    }
    
}
