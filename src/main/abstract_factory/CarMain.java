package main.abstract_factory;

import main.abstract_factory.Product.Door.DoorProduct;
import main.abstract_factory.factory.AmericaCarFactory;
import main.abstract_factory.factory.CarFactory;
import main.abstract_factory.factory.KoreaCarFactory;

public class CarMain
{
    public static void main (String[] args) {
        
        // 기본적으로 팩토리 클래스는 호출되면 객체를 생성하기만 하면 되기 때문에 메모리 최적화를 위해 각 팩토리 클래스마다 싱글톤을 적용하는 게 옳다.
        // 팩토리 타입을 변경할 필요성이 있을 때 계속 new로 초기화하면 가비지컬렉션에 부담이 되기 때문에
        CarFactory factory;

        // 싱글톤 적용 전, new로 객체를 생성하는 방식
        factory = new KoreaCarFactory();
        DoorProduct door = factory.createDoor();
        System.out.println(door.makeSound());
        
        factory = new AmericaCarFactory();
        door = factory.createDoor();
        System.out.println(door.makeSound());
        
        // 싱글톤 적용 후, getInstance()로 객체를 생성하는 방식
        factory = KoreaCarFactory.getInstance();
        door = factory.createDoor();
        System.out.println(door.makeSound());
        
        // 팩토리 타입을 변경할 필요성이 있을 때 계속 new로 초기화하면 가비지컬렉션에 부담이 된다.
        factory = AmericaCarFactory.getInstance();
        door = factory.createDoor();
        System.out.println(door.makeSound());
    }
}
