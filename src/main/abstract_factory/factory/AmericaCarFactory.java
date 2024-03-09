package main.abstract_factory.factory;

import main.abstract_factory.Product.Door.AmericaDoorProduct;
import main.abstract_factory.Product.Door.DoorProduct;
import main.abstract_factory.Product.Tire.AmericaTireProduct;
import main.abstract_factory.Product.Tire.TireProduct;

public class AmericaCarFactory
    implements CarFactory
{
    
    public AmericaCarFactory () {
    }
    
    // 싱글톤 객체화
    private static class SingleInstanceHolder {
        private static final AmericaCarFactory instance = new AmericaCarFactory();
    }
    
    public static AmericaCarFactory getInstance () {
        return SingleInstanceHolder.instance;
    }
    
    @Override
    public DoorProduct createDoor () {
        return new AmericaDoorProduct();
    }
    
    @Override
    public TireProduct createTire () {
        return new AmericaTireProduct();
    }
    
    
}
