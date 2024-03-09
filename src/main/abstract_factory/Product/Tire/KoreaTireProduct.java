package main.abstract_factory.Product.Tire;

public class KoreaTireProduct
    extends TireProduct
{
    
    @Override
    public String makeSound () {
        return "타이어 소리";
    }
}
