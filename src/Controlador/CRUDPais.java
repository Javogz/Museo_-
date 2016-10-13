package Controlador;

import Modelo.Pais;
import java.util.ArrayList;

public class CRUDPais {

    ArrayList<Pais> datos = new ArrayList<>();

    public void create(int pais_cod, String pais_nom) {
        datos.add(new Pais(pais_cod, pais_nom));
    }

    public String read() {
        String mensaje = "Lista de Paises\n";
        for (Pais p : datos) {
            mensaje += "Código: " + p.getPais_cod()
                    + "    Nombre: " + p.getPais_nom() + "\n";
        }
        return mensaje;
    }

    public Pais search(String buscar) {
        for (Pais p : datos) {
            if (p.getPais_nom().equals(buscar)
                    || p.getPais_cod() == Integer.parseInt(buscar)) {
                return p;
            }
        }
        return null;
    }

    public void delete(Pais p) {
        for (Pais p1 : datos) {
            if (p1.getPais_cod() == p.getPais_cod()) {
                datos.remove(datos.indexOf(p1));
                break;
            }
        }
    }
    
    public void update(Pais p, int cod) {
        for (Pais p1 : datos) {
            if (p1.getPais_cod() == cod) {
                datos.set(datos.indexOf(p1),p);
                break;
            }

        }

    }
}
