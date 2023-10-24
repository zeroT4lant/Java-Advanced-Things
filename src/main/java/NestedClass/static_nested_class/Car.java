package NestedClass.static_nested_class;

class Test {
    public static void main(String[] args) {
        //можем создать движок до создания объекта машины
        Car.Engine e1 = new Car.Engine(256);
        System.out.println(e1);
        //передаем движок в параметры
        Car c1 = new Car("black",2,e1);
        System.out.println(c1);
    }
}

//тоже самое можно делать с интерфейсами
public class Car {
    //к статичным/приватным переменным можно обратиться из вложенного класса
    //и наоборот
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        //из-за модификатора static, можем создавать в других классах объекты
        //без создания основного класса
        //только нужно указать в каком классе он находится
        //Car.Engine e1 = new Car.Engine(256); --- например
        int hoursePower;
        static int countOfEngines;

        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
            countOfEngines++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }
}


