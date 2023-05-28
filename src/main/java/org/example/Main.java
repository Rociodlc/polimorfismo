package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}


