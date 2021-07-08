public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(this, appetite);
    }

    public void Info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Кот " +
                "Имя: " + name + '\'' +
                ", Аппетит:" + appetite +
                ", Сытность:" + satiety +
                '}';
    }
}
