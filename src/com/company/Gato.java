package com.company;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato() {

    }

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public void compararNombre(Gato gatoComparado) {
        Gato gato1 = new Gato();
        gato1.setNombre(nombre);
        if (gato1.getNombre().compareTo(gatoComparado.getNombre()) < 0) {
            System.out.println("El nombre del gato 1 va primero alfabeticamente");
        } else if (gato1.getNombre().compareTo(gatoComparado.getNombre()) == 0) {
            System.out.println("Tienen el mismo nombre");
        } else {
            System.out.println("El nombre del gato 2 va primero alfabeticamente");
        }
    }

    public void compararEdad(Gato gatoComparado) {
        Gato gato1 = new Gato();
        gato1.setEdad(edad);
        if (Integer.compare(gato1.getEdad(), gatoComparado.getEdad()) > 0) {
            System.out.println("El gato 1 es mayor");
        } else if (Integer.compare(gato1.getEdad(), gatoComparado.getEdad()) == 0) {
            System.out.println("Los gatos tienen la misma edad");
        } else {
            System.out.println("El gato 2 es mayor");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
