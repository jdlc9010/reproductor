
package reproductormusica;

public class Main {
      public static void main(String[] args) {
          String[] cancionesEscogidas =new String[]{
             "mil horas",
              "por ese hombre",
              "a esa",
              "algo de mi",
              "si me dejas ahora",
              "quieres ser mi amante"
          };
          
      ReproductorMusica rp=new ReproductorMusica(cancionesEscogidas);  
     // System.out.println("canciones favorita: "+rp.getCancionesFavoritas().length);
      System.out.println("canciones escogidas: "+cancionesEscogidas.length);
    } 


}
