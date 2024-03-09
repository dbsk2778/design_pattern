package main.abstract_factory.Product.Tire;

public class AmericaTireProduct
    extends TireProduct
{
    
    @Override
    public String makeSound () {
        
        return "Tire sound";
    }
}
