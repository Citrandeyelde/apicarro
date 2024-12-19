package backend.idat.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vehiculo;

    private String Marca;
    private String Color;
    private Integer Año;
    private String Placa;

    public Vehiculo(){

    }
    public Vehiculo(String marca, String color, Integer año, String placa) {
        Marca = marca;
        Color = color;
        Año = año;
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer año) {
        Año = año;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }
}
