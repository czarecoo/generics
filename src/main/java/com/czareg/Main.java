package com.czareg;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CreationFailedException {
        List<Animal> animals = Arrays.asList(new Dog("Bob"), new Cat("Mr Whiskers"), new Dog("John"), new Cat("Meow"));

        Extractor<Cat, Animal> catExtractor = new Extractor<>(Cat.class);
        List<Cat> cats = catExtractor.extract(animals);
        System.out.println(cats);

        Extractor<Dog, Animal> dogExtractor = new Extractor<>(Dog.class);
        List<Dog> dogs = dogExtractor.extract(animals);
        System.out.println(dogs);

        Creator<Dog> dogCreator = new Creator<>(Dog.class);

        Animal dog = dogCreator.create(Arrays.asList(String.class), Arrays.asList("Flafik"));
        System.out.println(dog);
    }
}