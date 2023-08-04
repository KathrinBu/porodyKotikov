public class Cat {
    String name;
    Porody porody;

    public Cat(String name, Porody porody) {
        this.name = name;
        this.porody = porody;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", porody=" + porody +
                '}';
    }
}
