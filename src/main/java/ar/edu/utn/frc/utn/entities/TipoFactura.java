package ar.edu.utn.frc.utn.entities;

public class TipoFactura {
    private Integer id;
    private String name;

    public TipoFactura(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
