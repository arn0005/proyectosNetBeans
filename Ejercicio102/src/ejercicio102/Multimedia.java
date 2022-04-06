/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio102;

/**
 *
 * @author angel.ruiz
 */
public class Multimedia {

    int i = 0;
    String titulo;
    String formato;
    String formatos[] = {"mp3", "wav", "aac", "mp4", "mkv", "mov", "flv"};
    double duracion;

    public Multimedia(String title, String format, double length) {
        this.titulo = title;
        while (i < formatos.length) {
            if (format == formatos[i]) {
                this.formato = format;
                i = formatos.length;
            }
            i++;
        }
        this.duracion = length;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nFormato: " + formato + "\nDuracion: " + duracion;
    }

    public Boolean equals(Multimedia otroArchivo) {
        if (formato == otroArchivo.formato && duracion == otroArchivo.duracion) {
            return true;
        } else {
            return false;
        }
    }
}
