public class MyApp {
        public static void main(String[] args) {
            Cat cat = new Cat("Барсик", 8);
            Cat cat2 = new Cat("Пётр", 10);
            Cat cat3 = new Cat("Васька", 35);
            Plate plate = new Plate(20);
            System.out.println("\nДо покормления: ");
            plate.info();
            System.out.println("\n--------------");
            System.out.println("Ниже можно добавить еду: \n");
            plate.addFood(10);
            System.out.println("\n--------------");



            cat.Info();
            cat.eat(plate);
            cat.Info();
            cat.eat(plate);
            cat2.Info();
            cat2.eat(plate);
            cat3.Info();
            cat3.eat(plate);




            System.out.println("\n--------------");

            cat.eat(plate);
            cat.Info();
            cat.eat(plate);

            plate.info();


        }
    }
