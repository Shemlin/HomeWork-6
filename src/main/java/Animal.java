public class Animal {
    /**
     * здесь объявляем строки и переменные для животного
     */
    public String name;     //имя животного
    public String color;    //цвет животного
    public int age;         //возраст животного
    public int run;         //возможность животного бежать в метрах
    public int swim;        //возможность животного плыть в метрах

    /**
     * здесь объявляем метод для животного
     */
    public Animal(String name, String color, int age, int run, int swim){
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
        System.out.println("имя " + name + "|" + " цвет " + color + "|" + " возраст " + age + "|" + " может пробежать " + run + " метров " + "|" + " может проплыть " + swim + " метров");
    }

    /**
     * здесь идет проверка сколько животное пробежало с тем сколько оно может пробежать
     * @param distance - это расстояние, которое пробежало животное (или не пробежало)
     */
    public void run (int distance){
        if (distance <= run)
            System.out.println("имя " + name + " пробежал " + distance + " метров");
        else {
            System.out.println("имя " + name + " не смог пробежать " + distance + "метров");
        }
    }

    /**
     * здесь идет проверка сколько животное проплыло с тем сколько оно может проплыть
     * @param distance - это расстояние, которое проплыло животное (или не проплыло)
     */
    public void swim (int distance){
        if (distance <= swim)
            System.out.println("имя " + name + " проплыл " + distance + " метров");
        else {
            System.out.println("имя " + name + " не смог проплыть " + distance + " метров");
        }
    }
}
