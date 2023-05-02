
package tp6.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class Directorio {
    
    private HashMap<String, Cliente> registro= new HashMap<String, Cliente>();
    

    public boolean agregarCliente(String telefono, Cliente c){
        
        boolean existe=false;
        
        if(!registro.containsKey(telefono)){
            
            registro.put(telefono, c);
            existe=true;
        }else{
            JOptionPane.showMessageDialog(null, "Cliente ya registrado");
        }
        return existe;
    }
    
    public Cliente buscarCliente(String telefono) {
        
        Cliente c=null;
        
        if(registro.containsKey(telefono)){
            
           c=registro.get(telefono);     
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no registrado");
        }
        return c;
    }
    
//    buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
//teléfono asociados a dicho apellido.
    public ArrayList<String> buscarTelefono(String apellido){
        
        ArrayList <String> lista=new ArrayList<String>();
        
        for (Map.Entry<String, Cliente> entry : registro.entrySet())
        {
            
        }
                
        return lista;
    }
    
    
    
    
    
    
    
}
