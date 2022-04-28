package interfaces;

public class Fugl extends Dyr implements Fly{
    @Override
    public void makeSound() {
        System.out.println("the bird makes a sound");
    }

    @Override
    public void fly() {
        System.out.println("the bird flies");
    }
}
