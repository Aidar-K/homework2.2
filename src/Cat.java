public class Cat extends Animal implements Printable {
    private String cat;

    public Cat(String animal) {
        super(animal);
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC08");
    }
}
