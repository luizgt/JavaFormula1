package classes;



/**
 * Class Status
 */
public class Status {
    //
    // Fields
    //
    private boolean correndo = true;
    private boolean terminouCorrida = false;
    private boolean pitstop = false;
  
  //
  // Constructors
  //
  public Status (boolean c, boolean fim) {
      correndo = c;
      terminouCorrida = fim;
  };
  
  //
  // Methods
  //
  

  //
  // Accessor methods
  //
    
    /**
     * Get the value of correndo
     * @return the value of correndo
     */
    public boolean isCorrendo() {
        return correndo;
    }
    
    /**
    * Set the value of correndo
    * @param correndo the new value of status
    */
    public void setCorrendo(boolean correndo) {
        this.correndo = correndo;
    }
    
    /**
     * Get the value of terminouCorrida
     * @return the value of terminouCorrida
     */
    public boolean isTerminouCorrida() {
        return terminouCorrida;
    }
     
    /**
    * Set the value of terminouCorrida
    * @param terminouCorrida the new value of status
    */
    public void setTerminouCorrida(boolean terminouCorrida) {
        this.terminouCorrida = terminouCorrida;
    }
    
    /**
     * Get the value of pitstop
     * @return the value of stop
     */
    public boolean isPitstop() {
        return pitstop;
    }
    
    /**
    * Set the value of pitstop
    * @param pitstop the new value of status
    */
    public void setPitstop(boolean pitstop) {
        this.pitstop = pitstop;
    }
    
    //
    // Other methods
    //


}
