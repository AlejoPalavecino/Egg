/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rellenodatos;

import Librodelusuario.datoslibro;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class datos {
    
    public datoslibro informacion(){
        
        datoslibro l1 = new datoslibro();
        //Lleno los datos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el numero de ISBN");
        l1.setIsbn(leer.next());
        System.out.println("Ingrese la cantidad de paginas");
        l1.setPages(leer.nextInt());
        
        
        return l1;
    }

    
}
