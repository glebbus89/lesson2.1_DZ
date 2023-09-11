public class MainClass {
    public static void main(String[] args) {



        Cat[] cats = { new Cat("Barsik", 10),
                new Cat("Kuzya", 5),
                new Cat("Yashka", 20) };

        int plateSize = 10;
        Plate plate = new Plate(plateSize);

        plate.info();

        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                catEat(plate, cat);
            } else {
                System.out.printf("Еда закончилась, %s остался голодным\n добавили еду", cat.getName());
                System.out.println();
                plate.addFood(plateSize);
                System.out.println("Тарелка наполнена");
                plate.info();
                catEat(plate, cat);

            }
            plate.info();
            System.out.println();
        }

    }

    public static void catEat(Plate plate, Cat cat) {
        if (cat.getAppetite() <= plate.getFood()) {
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setSatiety(true);
            System.out.printf("%s - поел %d \n", cat.getName(), cat.getAppetite());
        }

        else
            System.out.println("Коту мало еды в тарелке, необходимо наполнить тарелку");
        cat.setSatiety(false);

    }
}