package main.abstract_factory.Product.Door;

public class AmericaDoorProduct
    extends DoorProduct
{
    
    @Override
    public String makeSound () {
        return "Door sound";
    }
}
