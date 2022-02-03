package com.company;

public class Main {

    public static void main(String[] args) {
        Gato gato1 = new Gato("Andres", "Rojo", "Europeo", 4);
        Gato gato2 = new Gato("Felipe", "Blanco", "Comun", 5);

        gato1.compararNombre(gato2);
        gato1.compararEdad(gato2);
    }
}
