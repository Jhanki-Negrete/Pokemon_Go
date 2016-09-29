/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon_go;
import processing.core.*;
/**
 *
 * @author Jhanki Negrete
 */
public class MySketch extends PApplet{
    Personaje player; Mapa mainMap, secondMap; PImage jugador, mapaPrincipal, Initiation_View, mensaje1, segundoMapa; int stage = 0;
    
    @Override
    public void settings() {
        size(700,600); // Tamaño del mapa
        
        // Instancia de un objeto mapa y personaje
        mainMap = new Mapa("Ruta_101.PNG","png",77);
        secondMap = new Mapa("Pueblo_Escaso.png","png",2);
        player = new Personaje("Personaje.png","png",width/2,height/2);
        
        // Representacion visual de los objetos map y player
        jugador = loadImage(player.getURL(),player.getTipo());
        mapaPrincipal = loadImage(mainMap.getURL(),mainMap.getTipo());
        Initiation_View = loadImage("Pokemones_Iniciales.jpg");
        mensaje1 = loadImage("Mensaje_Pokemon_Inicial.png");
        segundoMapa = loadImage(secondMap.getURL(),secondMap.getTipo());
        
        //Agregar posiciones bloqueadas
        mainMap.addBlockedPosition(350, 210);
        mainMap.addBlockedPosition(350, 390);
        mainMap.addBlockedPosition(385, 390);
        mainMap.addBlockedPosition(315, 390);
        mainMap.addBlockedPosition(280, 390);
        mainMap.addBlockedPosition(175, 270);
        mainMap.addBlockedPosition(140, 300);
        mainMap.addBlockedPosition(140, 330);
        mainMap.addBlockedPosition(105, 360);
        mainMap.addBlockedPosition(70, 360);
        mainMap.addBlockedPosition(35, 390);
        mainMap.addBlockedPosition(0, 390);
        mainMap.addBlockedPosition(315, 210);
        mainMap.addBlockedPosition(280, 210);
        mainMap.addBlockedPosition(245, 210);
        mainMap.addBlockedPosition(210, 210);
        mainMap.addBlockedPosition(175, 210);
        mainMap.addBlockedPosition(140, 210);
        mainMap.addBlockedPosition(105, 210);
        mainMap.addBlockedPosition(70, 210);
        mainMap.addBlockedPosition(105, 270);
        mainMap.addBlockedPosition(70, 270);
        mainMap.addBlockedPosition(385, 240);
        mainMap.addBlockedPosition(385, 270);
        mainMap.addBlockedPosition(385, 300);
        mainMap.addBlockedPosition(385, 330);
        mainMap.addBlockedPosition(420, 330);
        mainMap.addBlockedPosition(420, 300);
        mainMap.addBlockedPosition(420, 270);
        mainMap.addBlockedPosition(420, 240);
        mainMap.addBlockedPosition(455, 240);
        mainMap.addBlockedPosition(490, 240);
        mainMap.addBlockedPosition(490, 210);
        mainMap.addBlockedPosition(455, 210);
        mainMap.addBlockedPosition(0, 480);
        mainMap.addBlockedPosition(35, 480);
        mainMap.addBlockedPosition(35, 510);
        mainMap.addBlockedPosition(70, 540);
        mainMap.addBlockedPosition(105, 540);
        mainMap.addBlockedPosition(140, 540);
        mainMap.addBlockedPosition(175, 540);
        mainMap.addBlockedPosition(210, 540);
        mainMap.addBlockedPosition(245, 540);
        mainMap.addBlockedPosition(280, 540);
        mainMap.addBlockedPosition(315, 540);
        mainMap.addBlockedPosition(420, 540);
        mainMap.addBlockedPosition(420, 510);
        mainMap.addBlockedPosition(420, 480);
        mainMap.addBlockedPosition(420, 450);
        mainMap.addBlockedPosition(420, 420);
        mainMap.addBlockedPosition(455, 420);
        mainMap.addBlockedPosition(455, 450);
        mainMap.addBlockedPosition(490, 480);
        mainMap.addBlockedPosition(525, 480);
        mainMap.addBlockedPosition(560, 480);
        mainMap.addBlockedPosition(595, 480);
        mainMap.addBlockedPosition(630, 480);
        mainMap.addBlockedPosition(630, 450);
        mainMap.addBlockedPosition(630, 420);
        mainMap.addBlockedPosition(665, 490);
        mainMap.addBlockedPosition(595, 360);
        mainMap.addBlockedPosition(665, 420);
        mainMap.addBlockedPosition(665, 150);
        mainMap.addBlockedPosition(630, 150);
        mainMap.addBlockedPosition(595, 90);
        mainMap.addBlockedPosition(560, 90);
        mainMap.addBlockedPosition(525, 30);
        mainMap.addBlockedPosition(490, 30);
        mainMap.addBlockedPosition(455, 30);
        mainMap.addBlockedPosition(420, 30);
        mainMap.addBlockedPosition(420, 60);
        mainMap.addBlockedPosition(420, 90);
        mainMap.addBlockedPosition(420, 120);
        mainMap.addBlockedPosition(420, 150);
        mainMap.addBlockedPosition(420, 180);
        mainMap.addBlockedPosition(35, 240);
        mainMap.addBlockedPosition(560, 60);
        
        secondMap.addBlockedPosition(245, 30);
        secondMap.addBlockedPosition(210, 30);
        secondMap.addBlockedPosition(175, 30);
        secondMap.addBlockedPosition(140, 30);
        secondMap.addBlockedPosition(105, 30);
        secondMap.addBlockedPosition(70, 30);
        secondMap.addBlockedPosition(35, 30);
        secondMap.addBlockedPosition(0, 30);
        secondMap.addBlockedPosition(420, 30);
        secondMap.addBlockedPosition(455, 30);
        secondMap.addBlockedPosition(490, 30);
        secondMap.addBlockedPosition(525, 30);
        secondMap.addBlockedPosition(560, 30);
        secondMap.addBlockedPosition(595, 30);
        secondMap.addBlockedPosition(630, 30);
        secondMap.addBlockedPosition(665, 30);
        secondMap.addBlockedPosition(105, 60);
        secondMap.addBlockedPosition(70, 60);
        secondMap.addBlockedPosition(35, 60);
        secondMap.addBlockedPosition(0, 60);
        secondMap.addBlockedPosition(560, 60);
        secondMap.addBlockedPosition(595, 60);
        secondMap.addBlockedPosition(630, 60);
        secondMap.addBlockedPosition(665, 60);
        secondMap.addBlockedPosition(105, 90);
        secondMap.addBlockedPosition(70, 90);
        secondMap.addBlockedPosition(35, 90);
        secondMap.addBlockedPosition(0, 90);
        secondMap.addBlockedPosition(455, 90);
        secondMap.addBlockedPosition(490, 90);
        secondMap.addBlockedPosition(525, 90);
        secondMap.addBlockedPosition(560, 90);
        secondMap.addBlockedPosition(595, 90);
        secondMap.addBlockedPosition(630, 90);
        secondMap.addBlockedPosition(665, 90);
        secondMap.addBlockedPosition(245, 120);
        secondMap.addBlockedPosition(210, 120);
        secondMap.addBlockedPosition(175, 120);
        secondMap.addBlockedPosition(140, 120);
        secondMap.addBlockedPosition(35, 120);
        secondMap.addBlockedPosition(0, 120);
        secondMap.addBlockedPosition(455, 120);
        secondMap.addBlockedPosition(490, 120);
        secondMap.addBlockedPosition(525, 120);
        secondMap.addBlockedPosition(560, 120);
        secondMap.addBlockedPosition(630, 120);
        secondMap.addBlockedPosition(665, 120);
        secondMap.addBlockedPosition(0, 150);
        secondMap.addBlockedPosition(35, 150);
        secondMap.addBlockedPosition(140, 150);
        secondMap.addBlockedPosition(175, 150);
        secondMap.addBlockedPosition(210, 150);
        secondMap.addBlockedPosition(245, 150);
        secondMap.addBlockedPosition(455, 150);
        secondMap.addBlockedPosition(490, 150);
        secondMap.addBlockedPosition(525, 150);
        secondMap.addBlockedPosition(560, 150);
        secondMap.addBlockedPosition(630, 150);
        secondMap.addBlockedPosition(665, 150);
        secondMap.addBlockedPosition(0, 180);
        secondMap.addBlockedPosition(35, 180);
        secondMap.addBlockedPosition(140, 180);
        secondMap.addBlockedPosition(175, 180);
        secondMap.addBlockedPosition(210, 180);
        secondMap.addBlockedPosition(245, 180);
        secondMap.addBlockedPosition(630, 180);
        secondMap.addBlockedPosition(665, 180);
        secondMap.addBlockedPosition(0, 210);
        secondMap.addBlockedPosition(35, 210);
        secondMap.addBlockedPosition(630, 210);
        secondMap.addBlockedPosition(665, 210);
        secondMap.addBlockedPosition(0, 240);
        secondMap.addBlockedPosition(35, 240);
        secondMap.addBlockedPosition(0, 270);
        secondMap.addBlockedPosition(35, 270);
        secondMap.addBlockedPosition(385, 270);
        secondMap.addBlockedPosition(0, 330);
        secondMap.addBlockedPosition(35, 330);
        secondMap.addBlockedPosition(630, 330);
        secondMap.addBlockedPosition(665, 330);
        secondMap.addBlockedPosition(0, 360);
        secondMap.addBlockedPosition(35, 360);
        secondMap.addBlockedPosition(210, 360);
        secondMap.addBlockedPosition(245, 360);
        secondMap.addBlockedPosition(490, 360);
        secondMap.addBlockedPosition(525, 360);
        secondMap.addBlockedPosition(560, 360);
        secondMap.addBlockedPosition(595, 360);
        secondMap.addBlockedPosition(630, 360);
        secondMap.addBlockedPosition(665, 360);
        secondMap.addBlockedPosition(0, 390);
        secondMap.addBlockedPosition(35, 390);
        secondMap.addBlockedPosition(175, 390);
        secondMap.addBlockedPosition(210, 390);
        secondMap.addBlockedPosition(245, 390);
        secondMap.addBlockedPosition(280, 390);
        secondMap.addBlockedPosition(490, 390);
        secondMap.addBlockedPosition(525, 390);
        secondMap.addBlockedPosition(560, 390);
        secondMap.addBlockedPosition(595, 390);
        secondMap.addBlockedPosition(630, 390);
        secondMap.addBlockedPosition(665, 390);
        secondMap.addBlockedPosition(0, 420);
        secondMap.addBlockedPosition(35, 420);
        secondMap.addBlockedPosition(175, 420);
        secondMap.addBlockedPosition(210, 420);
        secondMap.addBlockedPosition(245, 420);
        secondMap.addBlockedPosition(280, 420);
        secondMap.addBlockedPosition(490, 420);
        secondMap.addBlockedPosition(525, 420);
        secondMap.addBlockedPosition(560, 420);
        secondMap.addBlockedPosition(595, 420);
        secondMap.addBlockedPosition(630, 420);
        secondMap.addBlockedPosition(665, 420);
        secondMap.addBlockedPosition(0, 450);
        secondMap.addBlockedPosition(35, 450);
        secondMap.addBlockedPosition(70, 450);
        secondMap.addBlockedPosition(105, 450);
        secondMap.addBlockedPosition(175, 450);
        secondMap.addBlockedPosition(210, 450);
        secondMap.addBlockedPosition(245, 450);
        secondMap.addBlockedPosition(280, 450);
        secondMap.addBlockedPosition(490, 450);
        secondMap.addBlockedPosition(525, 450);
        secondMap.addBlockedPosition(560, 450);
        secondMap.addBlockedPosition(595, 450);
        secondMap.addBlockedPosition(630, 450);
        secondMap.addBlockedPosition(665, 450);
        secondMap.addBlockedPosition(0, 480);
        secondMap.addBlockedPosition(35, 480);
        secondMap.addBlockedPosition(70, 480);
        secondMap.addBlockedPosition(105, 480);
        secondMap.addBlockedPosition(630, 480);
        secondMap.addBlockedPosition(665, 480);
        secondMap.addBlockedPosition(0, 510);
        secondMap.addBlockedPosition(35, 510);
        secondMap.addBlockedPosition(70, 510);
        secondMap.addBlockedPosition(105, 510);
        secondMap.addBlockedPosition(560, 510);
        secondMap.addBlockedPosition(595, 510);
        secondMap.addBlockedPosition(630, 510);
        secondMap.addBlockedPosition(665, 510);
        secondMap.addBlockedPosition(0, 540);
        secondMap.addBlockedPosition(35, 540);
        secondMap.addBlockedPosition(70, 540);
        secondMap.addBlockedPosition(105, 540);
        secondMap.addBlockedPosition(560, 540);
        secondMap.addBlockedPosition(595, 540);
        secondMap.addBlockedPosition(630, 540);
        secondMap.addBlockedPosition(665, 540);
        
        
        

        
        
        
    }
    
    @Override
    public void draw(){
        // Loop dibujo de la representacion del mapa y el jugador tras cada movimiento dependiendo del escenario
        switch(stage){
            case 0:
                image(Initiation_View,0,0,width,height/2);
                imageMode(CORNERS);
                image(mensaje1,0,height/2,width,height);
                break;
            case 1:
                image(mapaPrincipal,0,0,width,height);
                imageMode(CORNERS);
                image(jugador,player.getPosx(),player.getPosy(),player.getPosx()+40,player.getPosy()+40);
                println(player.getPosx()+"-"+player.getPosy());
                break;
            case 2:
                imageMode(CORNERS);
                image(segundoMapa,0,0,width,height);
                image(jugador,player.getPosx(),player.getPosy(),player.getPosx()+40,player.getPosy()+40);
                println(player.getPosx()+"-"+player.getPosy());
                break;
            default:
                break;
        }
        
    }
    
   @Override
    public void keyPressed() {  // Manejo del listener de las flechas del teclado
        switch(stage){
            case 0:
                if (key == 'a' || key == 'b' || key == 'c') {
                    stage=1;
                }
                break;
            case 1:
                if(key == CODED){
                    switch (keyCode){
                        case UP:
                            
                            if (player.getPosy()-30 > 0 && (!mainMap.isOnBlockPosition(player.getPosx(), player.getPosy()-30))) {
                              player.setPosy(player.getPosy()-30);
                            }
                            break;
                        case DOWN:
                            if ((player.getPosx() == 350 || player.getPosx() == 385) && player.getPosy() == 540) {
                                stage=2;
                                player.setPosx(350);
                                player.setPosy(0);
                            }
                            if (player.getPosy()+30 < height-30 && (!mainMap.isOnBlockPosition(player.getPosx(), player.getPosy()+30))) {
                                player.setPosy(player.getPosy()+30);
                            }
                            break;
                        case RIGHT:
                            if (player.getPosx()+35 < width && (!mainMap.isOnBlockPosition(player.getPosx()+35, player.getPosy()))) {
                                player.setPosx(player.getPosx()+35);
                            }
                            break;
                        case LEFT:
                            if (player.getPosx()-35 > -35 && (!mainMap.isOnBlockPosition(player.getPosx()-35, player.getPosy()))) {
                                player.setPosx(player.getPosx()-35);
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 2:
                if (key == CODED) {
                    switch(keyCode){
                        case UP:
                            if ((player.getPosx() == 350 || player.getPosx() == 315) && player.getPosy() == 30) {
                                stage = 1;
                                player.setPosx(385);
                                player.setPosy(570);
                            }
                            if (player.getPosy()-30 > 0 && (!secondMap.isOnBlockPosition(player.getPosx(), player.getPosy()-30))){
                                player.setPosy(player.getPosy()-30);
                            }
                            break;
                        case DOWN:
                            if (player.getPosy()+30 < height-30 && (!secondMap.isOnBlockPosition(player.getPosx(), player.getPosy()+30))){
                                player.setPosy(player.getPosy()+30);
                            }
                            break;
                        case RIGHT:
                            if (player.getPosx()+35 < width && (!secondMap.isOnBlockPosition(player.getPosx()+35, player.getPosy()))){
                                player.setPosx(player.getPosx()+35);
                            }
                            break;
                        case LEFT:
                            if (player.getPosx()-35 > -35 && (!secondMap.isOnBlockPosition(player.getPosx()-35, player.getPosy()))){
                                player.setPosx(player.getPosx()-35);
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            default:
                break;
        }
        super.keyPressed(); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
