package ar.edu.utn.frc.utn.entities;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Venta {

    private String numero;
    private float importe;
    private TipoFactura tipo;
    private String nombre;
    private int perfume ;

    public Venta(float importe, String numero, TipoFactura tipo, String nombre, int perfume) {
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

    public TipoFactura getTipo() {
        return tipo;
    }

    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
    }

    public int getPerfume() {
        return perfume;
    }

    public void setPerfume(int perfume) {
        this.perfume = perfume;
    }

    public Venta InsertVenta(String line, List<TipoFactura> tipos) throws ClassCastException {

        String[] data = line.split(";");

        String numero = data[0];
        float importe = Float.parseFloat(data[1]);
        TipoFactura tipo = (TipoFactura) tipos
                .stream()
                .filter(x -> x.getName().equals(data[2]));
        String nombre = data[3];
        int perfume = Integer.parseInt(data[4]);

        return new Venta(importe, numero, tipo, nombre, perfume);
    }

}
