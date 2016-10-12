package Modelo;

public class Pais {
    private int pais_cod;
    private String pais_nom;
    
    //Constructores

    public Pais() {
    }
    
    public Pais(int pais_cod, String pais_nom) {
        this.pais_cod = pais_cod;
        this.pais_nom = pais_nom;
    }
    
    //Mutadores

    public int getPais_cod() {
        return pais_cod;
    }

    public String getPais_nom() {
        return pais_nom;
    }
    
}
