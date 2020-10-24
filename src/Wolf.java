public class Wolf extends Dog implements Printable {
    private String wolf;

    public Wolf(String animal) {
        super(animal);
        this.wolf = wolf;
    }

    public void setWolf(String wolf) {
        this.wolf = wolf;
    }

    public String getWolf() {
        return wolf;
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC3A");
    }
}
