package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
 private String canal;

 public VideoYouTube(String titulo, int duracion, String genero, String canal) {
     super(titulo, duracion, genero);
     this.canal = canal;
 }

 public void mostrarDetalles() {
     System.out.println("Video YouTube: " + getTitulo() + " - Canal: " + canal);
 }
}