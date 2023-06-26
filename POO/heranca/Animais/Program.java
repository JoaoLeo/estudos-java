package POO.heranca.Animais;

public class Program {
    /* Write a Java program to create a class called Animal with a method called makeSound().
    Create a subclass called Dog that overrides the makeSound() method to bark */
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Cachorro cachorro = new Cachorro();
        System.out.println("Super classe: " + animalGenerico.makeSound());
        System.out.println("Sub Classe: " + cachorro.makeSound());
    }
}
