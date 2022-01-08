public class Main {
    public static void main(String[] args) {
        Cat Cat = new Cat("Барсик", "Белый", 3, 200, 0);
        System.out.println();
        Dog Dog = new Dog("Барбос", "Черный", 5, 500, 10);
        System.out.println();

        /**
         * задаем расстояние, которое пробегает кот
         */
        Cat.run(250);
        System.out.println();

        /**
         * задаем расстояние, которое пробегает собака
         */
        Dog.run(400);
        System.out.println();

        /**
         * задаем расстояние, которое проплывает кот
         */
        Cat.swim(10);
        System.out.println();

        /**
         * задаем расстояние, которое проплывает собака
         */
        Dog.swim(10);
        System.out.println();
    }
}
