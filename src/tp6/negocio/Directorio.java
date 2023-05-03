
package tp6.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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


            if(registro.containsValue(apellido)){
                lista.add(entry.getKey());
            }
        }
        return lista;
    }
   
//    buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes 
//    asociados a dicha ciudad.
    
     public ArrayList<Cliente> buscarClientes(String ciudad){
        
        ArrayList <Cliente> lista=new ArrayList<Cliente>(); // lista de tipo cliente
        Set <String> keys = registro.keySet();//lista Set que almacena las llaves
        Iterator <String> it = keys.iterator(); // iterador para recorrer las keys
        
        while(it.hasNext()){ // verifica que exista un proximo
            String keyActual = it.next(); //guarda la llave dnd esta posicionado
            Cliente clienteActual = registro.get(keyActual);//guarda el cliente donde esta posicionado el it
            
            if(clienteActual.getCiudad().equals(ciudad)){
                lista.add(clienteActual);
            }

        }
        return lista;
    }
    
    //borrarCliente() que en base al número de teléfono elimina al cliente del directorio.
     
     public void borrarCliente(String telefono, Cliente c){
        
        if(registro.containsKey(telefono)){
            
            registro.remove(c);
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no existe");
        }
        
    }
}
