package ar.edu.utn.frc.utn.entities;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Venta {

    private String numero;
    private float importe;
    private char tipo;
    private String nombre;
    private int perfume ;

    public Venta(){}

    public Venta(String lines) {

        String[] items = lines.split(";");
        this.numero = items[0];
        this.importe = Float.parseFloat(items[1]);
        this.tipo = items[2].charAt(0);
        this.nombre = items[3];
        this.perfume = Integer.parseInt(items[4]);
    }

    public Venta(float importe, String numero, char tipo, String nombre, int perfume) {
        this.importe = importe;
        this.numero = numero;
        this.tipo = tipo;
        this.nombre = nombre;
        this.perfume = perfume;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getPerfume() {
        return perfume;
    }

    public void setPerfume(int perfume) {
        this.perfume = perfume;
    }

    @Override
    public String toString() {
        return "{" +
                "numero='" + numero + '\'' +
                ", importe=" + importe +
                ", tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", perfume=" + perfume +
                '}';
    }

}
