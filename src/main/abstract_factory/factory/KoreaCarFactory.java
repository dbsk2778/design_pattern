package main.abstract_factory.factory;

import main.abstract_factory.Product.Door.DoorProduct;
import main.abstract_factory.Product.Door.KoreaDoorProduct;
import main.abstract_factory.Product.Tire.KoreaTireProduct;
import main.abstract_factory.Product.Tire.TireProduct;

public class KoreaCarFactory
    implements CarFactory
{
    
    public KoreaCarFactory () {
    }
    
    // 싱글톤 객체화
    private static class SingleInstanceHolder {
        private static final KoreaCarFactory instance = new KoreaCarFactory();
    }
    
    public static KoreaCarFactory getInstance () {
        return SingleInstanceHolder.instance;
    }
    
    @Override
    public DoorProduct createDoor () {
        return new KoreaDoorProduct();
    }
    
    @Override
    public TireProduct createTire () {
        return new KoreaTireProduct();
    }
    
    
}
