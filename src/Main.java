public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("num1");
        dog.print();
        Wolf wolf = new Wolf("num2");
        wolf.print();
        Cat cat = new Cat("num3");
        cat.print();
        Tiger tiger = new Tiger("num4");
        tiger.print();

        Printable[] printables = {cat, tiger, dog, wolf};

        createObject("cat").print();
        createObject("tiger").print();
        createObject("Dog").print();
        createObject("Wolf").print();

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "cat":
                printable = new Cat("Мяууу");
                break;
            case "tiger":
                printable = new Tiger("Аррр");
                break;
            case "Dog":
                printable = new Dog("Гаф");
                break;
            case "Wolf":
                printable = new Wolf("АУФ");
                break;
        }
        return printable;
    }
}

