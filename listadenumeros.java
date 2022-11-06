
package trycatch;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author given
 */
public class listadenumeros {

// crear una matriz
  private int[] list = {5, 6, 8, 9, 2};

  // metodo para escribir datos de un array a una fila
  public void writeList() {
    PrintWriter out = null;

    try {
      System.out.println("introduccion de la sentencia try");

      // crear un nuevo file OutputFile.txt
      out = new PrintWriter(new FileWriter("OutputFile.txt"));

      // escribir valores de list array to Output.txt
      for (int i = 0; i < 7; i++) {
        out.println("Valor en: " + i + " = " + list[i]);
      }
    }
    
    catch (Exception e) {
      System.out.println("Excepcion => " + e.getMessage());
    }
    
    finally {
      // comprobar si PrintWriter se ah abierto
      if (out != null) {
        System.out.println("Cerrando PrintWriter");
        // cerrar PrintWriter
        out.close();
      }
      
      else {
        System.out.println("PrintWriter no se abrio");
      }
    }

  }
}

class Main {
  public static void main(String[] args) {
    listadenumeros list = new listadenumeros();
    list.writeList();
  }
}
