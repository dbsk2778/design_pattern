package main.abstract_factory.factory;

import main.abstract_factory.Product.Door.DoorProduct;
import main.abstract_factory.Product.Tire.TireProduct;

public interface CarFactory
{
    
    public DoorProduct createDoor ();
    
    public TireProduct createTire ();
}
