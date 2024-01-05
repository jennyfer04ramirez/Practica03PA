/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.barzallomj_ramirezjc_practica3;

import javax.swing.ImageIcon;

/**
 *
 * @author casa
 */
public class HiloA extends Thread{
    private int tiempo;

    public HiloA(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        int numero = 1;
        while (true) {            
            if(numero ==5) numero = 1;
            System.out.println(numero);
            String ruta = "src\\main\\resources\\imagenes\\"+numero+".jpg";
            numero++;
            ImageIcon imagen = new ImageIcon(ruta);
            ec.edu.ups.barzallomj_ramirezjc_practica3.vista.VistaPrincipal.jLabel4.setIcon(imagen);
            try{
                Thread.sleep(this.tiempo);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
