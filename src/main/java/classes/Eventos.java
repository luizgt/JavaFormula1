package classes;

import java.util.ArrayList;
import java.util.Random;



/**
 * Class Eventos
 */
public class Eventos extends Thread{
    
    //NÃO ESTA SENDO USADA!!!!!!!!!!!!!!!
    private boolean chuva = false; 
    private boolean acidente = false;
    private boolean pistop = false;
    private boolean quebrarCarro = false;
    private ArrayList<Carro> carros;
    private int voltaAtual;
    private int qtdVoltas;
    
    public Eventos(ArrayList<Carro> lista, int numVoltas){
        carros = lista;
        qtdVoltas = numVoltas;
    }
    
    @Override
    public void run(){
        
        for(voltaAtual = 0; voltaAtual < qtdVoltas; voltaAtual++){
            Random random = new Random();
      
            int e = random.nextInt(10); //Sorteia um evento que pode ser: (1) Chuva (2)Acidente (3)Pitstop (4)Quebrar Carro (>5)Nenhum
            int idCarro = random.nextInt(carros.size());
            int idCarro2 = random.nextInt(carros.size());

            switch(e){
              case 1:
                  
                  System.out.println("Começou a chover");

                  break;
              case 2:
                  for(Carro c: carros){
                      if(c.getIdCarro() == idCarro){
                          c.setEvento(1);
                      }
                  }
                  System.out.println("Um acidente na pista entre " + idCarro + " e " + idCarro2);

                  break;
              case 3:
                  System.out.println("Carro " + idCarro + " no pitstop");

                  break;
              case 4:
                  System.out.println("Carro " +idCarro+ " quebrou");

                  break;
              default:
                  break;

            }
        }  
    }
}
