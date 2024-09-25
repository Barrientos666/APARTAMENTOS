package org.example.MODELOS;public class Apartamento {
    private String direccion;
    private int numeroHabitaciones;
    private double metrosCuadrados;
    private boolean tieneBalcon;
    private int piso;
    private double precio;
    private Long id;

    public Apartamento() {
    }

    public Apartamento(String direccion, int numeroHabitaciones, double metrosCuadrados, boolean tieneBalcon, int piso, double precio, Long id) {
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.tieneBalcon = tieneBalcon;
        this.piso = piso;
        this.precio = precio;
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "direccion='" + direccion + '\'' +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", metrosCuadrados=" + metrosCuadrados +
                ", tieneBalcon=" + tieneBalcon +
                ", piso=" + piso +
                ", precio=" + precio +
                ", id=" + id +
                '}';
    }
}
