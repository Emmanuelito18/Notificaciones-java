/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import formularios.principalNotificaciones;
//<editor-fold defaultstate="collapsed" desc="Librerias notificacion java">
import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Librerias notifiacion DS">
import ds.desktop.notify.DesktopNotify;
import java.awt.Toolkit;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Librerias notifiacion RS">

//</editor-fold>
/**
 *
 * @author Emmanuel
 */
public class main {
    //<editor-fold defaultstate="collapsed" desc="Notificacion java">
    public static void mostrarNotificacion(String titulo, String mensaje) {
        // Verifica si el sistema soporta la bandeja del sistema
        if (SystemTray.isSupported()) {
            // Obtiene la instancia de SystemTray
            SystemTray tray = SystemTray.getSystemTray();
            
            // Carga una imagen para el icono de la bandeja del sistema
            Image icono = Toolkit.getDefaultToolkit().getImage("//notificacion.png"); // Cambia la ruta al icono deseado

            // Crea un nuevo TrayIcon
            TrayIcon trayIcon = new TrayIcon(icono, "Notificación Windows 10");
            trayIcon.setImageAutoSize(true);
            
            try {
                // Añade el TrayIcon a la bandeja del sistema
                tray.add(trayIcon);
            } catch (AWTException e) {
                e.printStackTrace();
            }

            // Muestra la notificación con el título y el mensaje proporcionados
            trayIcon.displayMessage(titulo, mensaje, TrayIcon.MessageType.INFO);
        } else {
            // Si la bandeja del sistema no es compatible, imprime un mensaje de error
            System.err.println("El sistema de bandeja no es compatible.");
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notificacion DS">
    public void notificacionDS(){
     DesktopNotify.showDesktopMessage("Notificacion DS","Esto es una prueba de notificaciones de Dragshot",DesktopNotify.INFORMATION,10000L);   
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notifiacion RS">
        public void notificacionRS(){
            
        }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Función principal del programa">
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        principalNotificaciones p=new principalNotificaciones();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    //</editor-fold>
}
