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
        
        if(this.valor >= 0) { 
            this.valor = valor;                                                                                           
            return valor;                                                                                                     
        } else {                                                                                    
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");                                                     
        } 
    }                                                                                                                                                                                                          

    public boolean ehPrimo ( ) {
        int valor = this.getValor(); 
        if (valor==1) {
            return false;
        }                                                                                                     
        for (int i=2; i<valor-1; i++) {                                                                                             
            if(valor%i==0) {                                                                                                  
                return false;                                                                                              
            }                                                                                                               
        } 
        return true;                                                                                                                        
    }                                                                                                                                
}                                                                                                                                         