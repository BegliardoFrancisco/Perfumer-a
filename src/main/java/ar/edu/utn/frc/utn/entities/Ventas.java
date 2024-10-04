package ar.edu.utn.frc.utn.entities;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ventas {

    private List<Venta> ventas;

    public Ventas() {
        this.ventas = new ArrayList<Venta>();
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void InsertVenta(URL location) throws URISyntaxException, IOException {

        Files.lines(Paths.get(location.toURI()))
                .skip(1)
                .map(Venta::new)
                .forEach(t -> this.ventas.add(t));
    }

    public List<Venta> importeTipoFilter(char tipo, float importe) {

        return this.ventas.stream()
                .filter(x-> x.getImporte() > importe & x.getTipo() != tipo)
                .sorted(Comparator.comparing(Venta::getImporte))
                .toList();
    }

    public float totalPorTipos(int perfume) {

        return  this.ventas.stream()
                .skip(1)
                .filter(x -> x.getTipo() == perfume)
                .map(Venta::getImporte)
                .reduce(0f, Float::sum);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ventas.forEach(t -> sb.append(t.toString() + "\n"));
        return sb.toString();

    }
}
