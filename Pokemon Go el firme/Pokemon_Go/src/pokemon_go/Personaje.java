/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon_go;

/**
 *
 * @author Jhanki Negrete
 */
public class Personaje {
    private String URL;
    private String tipo;
    private int posx;
    private int posy;

    public Personaje(String URL, String tipo, int posx, int posy) {
        this.URL = URL;
        this.tipo = tipo;
        this.posx = posx;
        this.posy = posy;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
}
