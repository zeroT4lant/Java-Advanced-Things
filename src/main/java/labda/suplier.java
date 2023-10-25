package labda;

import java.util.ArrayList;
import java.util.function.Supplier;

//поставляет объекты
public class suplier {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Car> list = createThreeCars(() ->
                new Car("Lada","blue",2000));
        System.out.println("Out cars: " + list);
    }
}

class Car {
    String model;
    String color;
    int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
