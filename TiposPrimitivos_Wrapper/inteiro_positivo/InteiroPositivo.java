public class InteiroPositivo {                                                                                                                                                                                                                    
    private int valor;                                                                                               
                                                                                                                                                  
    public InteiroPositivo (int valor) {                                                                                              
        this.valor = Integer.valueOf(valor);                                                                                      
    }                                                                                                                                 
    public InteiroPositivo (String valor) {                                                                                           
        this.valor = Integer.parseInt(valor);                                                                                     
    }
    public int getValor() {
        return valor;
    }
    public int setValor(int valor) {
        this.valor = valor;
        if(this.valor >= 0) {                                                                                            
            return valor;                                                                                                     
        } else {                                                                                    
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");                                                     
        } 
    }                                                                                                                                                                                                          

    public boolean ehPrimo () {                                                                                                      
        for (int i=2; i<valor; i++) {                                                                                             
            if(valor%i==0 || valor%i==1) {                                                                                                  
                return true;                                                                                              
            } else {                                                                                                          
                return false;                                                                                             
            }                                                                                                                 
        }                                                                                                                         
    }                                                                                                                                
}                                                                                                                                         