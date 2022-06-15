public class InteiroPositivo {                                                                                                                                                                                                                    
    private int valor;                                                                                               
                                                                                                                                                  
    public InteiroPositivo (int valor) {                                                                                              
        this.valor = Integer.valueOf(valor);                                                                                      
    }                                                                                                                                 
    public InteiroPositivo (String valor) {  
        int valorNovo = Integer.parseInt(valor);  
        this.setValor(valorNovo);                                                                                      
                                                                                           
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        
        if(valor >= 0) { 
            this.valor = valor;                                                                                           
            //return this.valor;                                                                                                     
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