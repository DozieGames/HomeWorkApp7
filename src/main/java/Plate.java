public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(Cat cat, int n) {
        if (food < 0) {
            throw new IllegalArgumentException("Состав тарелки не может быть отрицательным");
        } else if (food == 0) {
            System.out.println("Котику ничего не досталось :(");
        } else if (food < n) {
            System.out.println("Котик захотел съесть " + n + " но в тарелки было только 30 и он решил не кушать :(");
        } else if (cat.getSatiety() == false) {
            System.out.println("Котик скушал " + n);
            cat.setSatiety(true);
            food -= n;
        } else {
            System.out.println("Котик наелся и больше кушать не хочет :(");
        }
    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }

        public void addFood(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Добавление к тарелки не может быть отрицательным");
            } else if (i == 0) {
                throw new IllegalArgumentException("Добавление к тарелки не может равняться нулю ");
            } else {
                food = food + i;
                System.out.println("Было добавлено: " + i);
            }
        }
    }