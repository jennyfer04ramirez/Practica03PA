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
public class HiloB extends Thread {
    private int tiempo;

    public HiloB(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        int numero = 1;
        while (true) {
            String ruta = "src\\main\\resources\\imagenes\\" + numero + ".jpg";
            ImageIcon imagen = new ImageIcon(ruta);
            ec.edu.ups.barzallomj_ramirezjc_practica3.vista.VistaPrincipal.jLabel7.setIcon(imagen);

            int siguienteNumero = (numero % 4) + 1; 
            String ruta1 = "src\\main\\resources\\imagenes\\" + siguienteNumero + ".jpg";
            ImageIcon imagen1 = new ImageIcon(ruta1);
            ec.edu.ups.barzallomj_ramirezjc_practica3.vista.VistaPrincipal.jLabel8.setIcon(imagen1);

            int siguienteNumero2 = ((numero + 1) % 4) + 1;
            String ruta2 = "src\\main\\resources\\imagenes\\" + siguienteNumero2 + ".jpg";
            ImageIcon imagen2 = new ImageIcon(ruta2);
            ec.edu.ups.barzallomj_ramirezjc_practica3.vista.VistaPrincipal.jLabel9.setIcon(imagen2);

            int siguienteNumero3 = ((numero + 2) % 4) + 1;
            String ruta3 = "src\\main\\resources\\imagenes\\" + siguienteNumero3 + ".jpg";
            ImageIcon imagen3 = new ImageIcon(ruta3);
            ec.edu.ups.barzallomj_ramirezjc_practica3.vista.VistaPrincipal.jLabel10.setIcon(imagen3);

            numero = siguienteNumero;
            try {
                Thread.sleep(this.tiempo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
