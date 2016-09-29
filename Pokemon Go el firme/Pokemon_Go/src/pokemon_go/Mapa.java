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
public class Mapa{
    private String URL;
    private String tipo;
    private int[][] blockedPositions;
    private int indexInBlockedPosition;
    private final int totalBlockedPositions;

    public Mapa(String URL, String tipo, int blockedPositions) {
        this.URL = URL;
        this.tipo = tipo;
        this.blockedPositions = new int[blockedPositions][2];
        this.indexInBlockedPosition = 0;
        this.totalBlockedPositions = blockedPositions;
    }
    
    public boolean isOnBlockPosition(int posx, int posy){
        int i = 0;
        while(i < this.indexInBlockedPosition){
            if (this.blockedPositions[i][0] == posx && this.blockedPositions[i][1] == posy) {
                return true;
            }
            i++;
        }
        return false;
    }
    
    public void addBlockedPosition(int posx, int posy){
        if (this.indexInBlockedPosition < this.totalBlockedPositions) {
            this.blockedPositions[this.indexInBlockedPosition][0] = posx;
            this.blockedPositions[this.indexInBlockedPosition][1] = posy;
            this.indexInBlockedPosition++;
        }
    }
    
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[][] getBlockedPositions() {
        return blockedPositions;
    }

    public void setBlockedPositions(int[][] blockedPositions) {
        this.blockedPositions = blockedPositions;
    }
    
    
}
