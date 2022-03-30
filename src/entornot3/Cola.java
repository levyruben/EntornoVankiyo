

package entornot3;

import java.util.ArrayList;


public class Cola {
ArrayList <Cliente> Lista_Cola = new ArrayList<Cliente>();
    
    
    
    
    public void dejar_pasar(Cliente pasar){
        int tmp;
       if( Lista_Cola.contains(pasar) ){
           tmp = Lista_Cola.lastIndexOf(pasar);
       
       }
    
    }
    
    
}
