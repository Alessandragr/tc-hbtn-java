public class InteiroPositivo {                                                                                                                    
    public static void main (String[] args) {                                                                                                 
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
            this.valor = valor
        }                                                                  
                                                                                                                                                  
        public ehInteiro (Object valor) {                                                                                                 
            if(valor istanceOf Integer) {                                                                                            
                return valor;                                                                                                     
            } catch (IllegalArgumentException e) {                                                                                    
                System.out.println("Valor nao eh um valor inteiro positivo");                                                     
                }                                                                                                                         
            } 

        Public ehPrimo (int valor) {                                                                                                      
            for (int i=2; i<valor; i++) {                                                                                             
                if(valor%i==0) {                                                                                                  
                    return true;                                                                                              
                } else {                                                                                                          
                    return false;                                                                                             
                }                                                                                                                 
            }                                                                                                                         
        }                                                                                                                                
    } 
}                                                                                                                                        