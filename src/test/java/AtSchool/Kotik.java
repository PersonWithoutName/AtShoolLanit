package AtSchool;

import org.junit.Test;

public class Kotik {
    @Test
    public void example1() {
        Kotik kotik = new Kotik();
        kotik.prettiness = 9999;
        kotik.name = "Рыжый";
        kotik.weight = 6327;//в граммах
        kotik.meow = "Кря кря";
        kotik.liveAnotherDay();
    }

    @Test
    public void example2() {
        Kotik kotik1; // Объявление переменной
        Kotik kotik2; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik2 = kotik1; //Переприсваивание ссылки
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        System.out.println(kotik2.name + " - " + kotik2.prettiness);
    }

    @Test
    public void example3() {
        Kotik kotik1; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        kotik1.meow = "Кря кря";
        kotik1.sayMeow();
    }

    int prettiness;
    int weight;
    int satiety = 10;
    String foodName = "Cat's food";
    String name;
    String meow;

    //Конструктор без параметров, он идентичен конструктору по умолчанию, 
    //который сюда бы подставила Java,    
    // Но она его не подставит, по той причине, 
    //что ниже определяется другой конструктор, с параметрами.
    public Kotik() {
    }

//    public Kotik(int prettiness, int weight, String name, String meow) {
//        this.prettiness = prettiness;
//        this.weight = weight;
//        this.name = name;
//        this.meow = meow;
//    }


//    void setKotik(int prettiness, String name, int weight, String meow) {
//        this.prettiness = prettiness;
//        this.weight = weight;
//        this.name = name;
//        this.meow = meow;
//    }

    int giveMeMoney() {
        return 100;
    }

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }

    public int play(int satiety) {
        System.out.println(name + " играет с хвостом");
        return satiety--;
    }

    public int sleep(int satiety) {
        System.out.println(name + " спит");
        return satiety--;
    }

    public int chaseMouse(int satiety) {
        System.out.println(name + " ловит мышку");
        return satiety--;
    }

    void eat() {
        System.out.println(name + " кушает");
        Kotik.eat(satiety, foodName);
    }

    public static int eat(int satiety) {
        return satiety++;
    }

    public static int eat(int satiety, String foodName) {
        System.out.println( "Котик кушает " + foodName);
        return satiety++;
    }

    public int walk(int satiety) {
        System.out.println(name + " гуляет");
        return satiety--;
    }

    public int sharpenClaws(int satiety) {
        System.out.println(name + " точит ногти");
        return satiety--;
    }

    void liveAnotherDay() {
        int hour = 24;
        while (hour >= 24) {
            if (satiety <= 0) {
                System.out.println("Kotik want eat");
                Kotik.eat(satiety, foodName);
            } else {
                int act = (int) (Math.random() * 7 + 1);
                switch (act) {
                    case 1:
                        play(satiety);
                    case 2:
                        sayMeow();
                    case 3:
                        sleep(satiety);
                    case 4:
                        chaseMouse(satiety);
                    case 5:
                        eat();
                    case 6:
                        walk(satiety);
                    case 7:
                        sharpenClaws(satiety);
                }
                hour--;
            }
        }
    }
}
