/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import formularios.principalNotificaciones;
//<editor-fold defaultstate="collapsed" desc="Librerias notificacion java">
/*import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;*/
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Librerias notifiacion DS">
import ds.desktop.notify.DesktopNotify;
//</editor-fold>
/**
 *
 * @author Emmanuel
 */
public class main {
    //<editor-fold defaultstate="collapsed" desc="Notificacion java">
    /*PopupMenu popup=new PopupMenu();
    private Image imagen=new ImageIcon(getClass().getResource("/imagenes/notificacion.png")).getImage();
    private final TrayIcon trayIcon=new TrayIcon(imagen,"Notificación java",popup);
    //obtiene instancia SsytemTray
    final SystemTray systemTray=new SystemTray.getSystemTray();
    //Para el timer
    private Timer contador;
    public static boolean bandera;
    
    void Notificacion(){
        //comprueba si systemTray es soportado en el sistema
        if(SystemTray.isSupported()){
            //acciones del raton sobre el icono del la barra de tareas
            MouseListener mouseListener=new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //Si se presiono el boton izquierdo y la aplicacion esta minimizada
                    if (e.getButton() == MouseEvent.BUTTON1)// && miframe.getExtendedState()==JFrame.ICONIFIED )
                    {
                        MensajeTrayIcon("Por favor verifique la informaciÃ³n", TrayIcon.MessageType.WARNING);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent evt) {
                }

                @Override
                public void mouseExited(MouseEvent evt) {
                }

                @Override
                public void mousePressed(MouseEvent evt) {
                }

                @Override
                public void mouseReleased(MouseEvent evt) {
                }
            };
            //acciones del menu popup
        }
    }*/
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notificacion DS">
    public void notificacionDS(){
     DesktopNotify.showDesktopMessage("Notificacion DS","Esto es una prueba de notificaciones de Dragshot",DesktopNotify.INFORMATION,10000L);   
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
