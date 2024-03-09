package main.abstract_factory.Product.Door;

public class KoreaDoorProduct
    extends DoorProduct
{
    
    @Override
    public String makeSound () {
        return "문 열리는 소리";
    }
    
}
