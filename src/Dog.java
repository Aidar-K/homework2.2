public class Dog extends Animal implements Printable {
    private int dog;


    public Dog(String animal) {
        super(animal);
        this.dog = dog;
    }

    public int getDog() {
        return dog;
    }

    public void setDog(int dog) {
        this.dog = dog;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC36");
    }
}
