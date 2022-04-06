package ejercicio102;

public class Cancion extends Multimedia {

    private String artista, editor, genero;
    // String generos[] = {"pop", "rock", "flamenco", "hiphop", "R&B", "reggaeton"};

    public Cancion(String artista, String editor, String title, String format, double length) {
        super(title, format, length);
        this.artista = artista;
        this.editor = editor;
        this.genero = "reggaeton";
    }

    public String getArtista() {
        return artista;
    }

    public String getEditor() {
        return editor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + "Artista: " + artista + "\nEditor: " + editor + "\nGenero: " + genero;
    }

}
