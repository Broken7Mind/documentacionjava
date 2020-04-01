package principal;

import metodos.MandarPantalla;

/**
 * Programa principal que usa los métodos auxiliares para el salto de línea de la clase MandarPantalla
 * 
 * @author Ismael Ramos Guisado
 * @author ismael.ramos@campusfp.es
 * @version 1.1
 * @see <a href="https://www.dataismaelramos.com"> dataismaelramos.com - Aprende a programar </a>
 */
public class Main {

    /**
     * Punto de entrada único al proyecto
     * 
     * <ul>
     *      <li style="color:red">Utiliza método sin salto</li>
     *      <li>Utiliza método con salto</li>
     * </ul>
     * 
     * @param args arreglo de tipo String
     */
    
    public static void main(String[] args) {
        MandarPantalla mp = new MandarPantalla();
        
        mp.conSalto("Esto es una línea con salto");
        mp.sinSalto("Esto es una línea sin salto");
    }
    
}
