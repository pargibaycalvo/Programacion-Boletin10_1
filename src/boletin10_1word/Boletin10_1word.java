
package boletin10_1word;

import javax.swing.JOptionPane;

public class Boletin10_1word {

    public static void main(String[] args) {
        pc obx = new pc ();//llamamos a pc para que haga los calculos necesarios
        JOptionPane.showInputDialog("Player 1");//añadimos que el player 1 introduzca el numero
        obx.numoculto(obx.control());//le decimos que nos verifique que el numero es correcto y realize el juego
        obx.lvl();//que nos verifique el nivel
        JOptionPane.showInputDialog("Player 2");//añadimos que el player 2 introduzca el numero
        
        do{
        }while((obx.play(obx.control())==false)&&(obx.intentosnumero()==true));
        }
  
    }
    
