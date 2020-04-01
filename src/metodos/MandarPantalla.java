package metodos;

/**
 * Programa que implementa una clase con métodos auxiliares para el salto de línea y línea continua.
 * 
 * @author Ismael Ramos Guisado
 * @author ismael.ramos@campusfp.es
 * @version 1.1
 * @see <a href="https://www.dataismaelramos.com"> dataismaelramos.com - Aprende a programar </a>
 */
public class MandarPantalla {
    
    /**
     * Método para línea continua
     * 
     * @param s es un String que se muestra en pantalla sin salto
     */
    
    public void sinSalto(String s){
        System.out.print(s);
    }
    
    /**
     * Método para salto de línea
     * 
     * @param s es un String que se muestra en pantalla con salto
     */
    public void conSalto(String s){
        System.out.println(s);
    }
    
}
