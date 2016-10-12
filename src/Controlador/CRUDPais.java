package Controlador;

import Modelo.Pais;
import java.util.ArrayList;

public class CRUDPais {
    ArrayList<Pais> datos=new ArrayList<>();
    
    public void create(int pais_cod, String pais_nom){
        datos.add(new Pais(pais_cod, pais_nom));
    }
    
    public String read(){
        String mensaje="Lista de Paises\n";
        for (Pais p:datos) {
            mensaje+="Código: "+p.getPais_cod()+
                    "    Nombre: "+p.getPais_nom()+"\n";
        }
        return mensaje;
    }
}
