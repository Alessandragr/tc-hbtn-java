public class InteiroPositivo {                                                                                                                    
    public static void main (String[] args) {                                                                                                 
        public int valor;                                                                                                                
                                                                                                                                                  
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
        }                                                                  
                                                                                                                                                  
        public ehInteiro (int valor) {                                                                                                 
            if(valor%2==0 || valor%3==1) {                                                                                            
                return valor;                                                                                                     
            } else {                                                                                    
                thow new IllegalArgumentException("Valor nao eh um valor inteiro positivo");                                                     
            }                                                                                                                         
        } 

        public boolen ehPrimo () {                                                                                                      
            for (int i=1; i<valor; i++) {                                                                                             
                if(valor%i==0 ) {                                                                                                  
                    return true;                                                                                              
                } else {                                                                                                          
                    return false;                                                                                             
                }                                                                                                                 
            }                                                                                                                         
        }                                                                                                                                
    } 
}                                                                                                                                        