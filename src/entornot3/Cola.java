

package entornot3;

import java.util.ArrayList;


public class Cola {
    ArrayList <Cliente> Lista_Cola = new ArrayList<Cliente>();
    
    
    
    
    public void dejar_pasar(Cliente pasar){
       if( Lista_Cola.contains(pasar) ){
           Lista_Cola.add(1 , pasar);

       
       }
    
    }
    
    
}
