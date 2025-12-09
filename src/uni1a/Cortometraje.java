package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
 private boolean esIndependiente;

 public Cortometraje(String titulo, int duracion, String genero, boolean esIndependiente) {
     super(titulo, duracion, genero);
     this.esIndependiente = esIndependiente;
 }

 public void mostrarDetalles() {
     System.out.println("Cortometraje: " + getTitulo() + " - Indie: " + esIndependiente);
 }
}