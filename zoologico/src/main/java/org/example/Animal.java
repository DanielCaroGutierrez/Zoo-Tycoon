package org.example;

public class Animal {

    private String  nombre;
    private String genero;
    private double peso=1;
    Animal pareja;

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }

}
