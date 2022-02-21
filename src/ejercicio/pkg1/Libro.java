/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import Librodelusuario.datoslibro;
import rellenodatos.datos;

/**
 *
 * @author alejo
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        datos libro = new datos();
        datoslibro l1 = libro.informacion();
        
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Número ISBN: "+ l1.getIsbn() );
        System.out.println("Número de páginas: " + l1.getPages());
        
        
        
    }
    
}
