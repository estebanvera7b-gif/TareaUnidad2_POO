package poo;

import uni1a.*; 

public class PruebaAudioVisual {

    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SISTEMA AUDIOVISUAL ---");

       
        Pelicula titanic = new Pelicula("Titanic", 195, "Romance", "20th Century Fox");
        Actor leo = new Actor("Leonardo", "DiCaprio");
        Actor kate = new Actor("Kate", "Winslet");
        
        titanic.agregarActor(leo);
        titanic.agregarActor(kate);
        
        System.out.println(">> Probando Película:");
        titanic.mostrarDetalles(); 
        

       
        SerieDeTV breakingBad = new SerieDeTV("Breaking Bad", 50, "Crimen", 5);
        Temporada t1 = new Temporada(1, 7); 
        Temporada t2 = new Temporada(2, 13); 
        
        breakingBad.agregarTemporada(t1);
        breakingBad.agregarTemporada(t2);
        
        System.out.println(">> Probando Serie de TV:");
        breakingBad.mostrarDetalles(); 


      
        Documental cosmos = new Documental("Cosmos", 60, "Ciencia", "Astronomía");
        Investigador carl = new Investigador("Carl", "Sagan", "Astrofísica"); 
        
        cosmos.setInvestigador(carl);
        
        System.out.println(">> Probando Documental:");
        cosmos.mostrarDetalles(); 
        
     }
}