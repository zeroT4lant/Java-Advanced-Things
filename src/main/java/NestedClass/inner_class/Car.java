package NestedClass.inner_class;

class Test {
    public static void main(String[] args) {
        //LFGO
        //engine создаётся сразу внутри car
        Car car = new Car("Green",2,256);

        //(после знака равно) у объекта car создаём новый объект типа Engine
//        Car.Engine en1 = car.new Engine(150);
//        car.setEngine(en1);
        System.out.println(car);

//        Car.Engine engine3 = new Car("yellow",4).new Engine(200);

    }
}
//иннер класс содержит только non-static элементы
public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount,int horsePower) {
        this.color = color;
        this.doorCount = doorCount;

        //!!!!!!!!!!!!!!!!!!!!!!!! IMBA
        //можно создать движок сразу внутри конструктора
        //и присвоить его
        this.engine = new Engine(horsePower);
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // присваиваем новый мотор на месте
        // и в параметрах передаем переменную horsePower из аргументов выше
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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

    public class Engine{//иннер класс, всегда связан со своим внешним классом

        int hoursePower;

        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }
}
