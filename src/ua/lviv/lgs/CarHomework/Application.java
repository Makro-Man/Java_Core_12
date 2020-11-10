package ua.lviv.lgs.CarHomework;



import java.util.ArrayList;
import java.util.Scanner;

public class Application implements Randomable {
    public static void main(String[] args) {

        int a = Randomable.getRandomValueFromRange(2, 5);

        ArrayList cars = new ArrayList();

        for (int i = 0; i<a; i++){

            cars.add(new Car(Randomable.getRandomValueFromRange(2,6), Randomable.getRandomValueFromRange(4,7),
                    new Helm(Randomable.getRandomValueFromRange(4,7),"Alcantara"),
                    new Engine(Randomable.getRandomValueFromRange(3,7))));
        }

        while(true){
            menu();
            Scanner scan = new Scanner(System.in);

            String sc = scan.nextLine();

            switch (sc){
                case "1":
                    for (int i=0; i<cars.size(); i++){
                        System.out.println(cars.get(i));
                    }
                    break;
                case "2":
                    Car auto = new Car(100, 1987, new Helm(100, "Alcantara"), new Engine(100));
                    ArrayList car = new ArrayList();
                    for (int i =0; i<a; i++){
                        car.add(auto);
                        System.out.println(car.get(i));
                    }
                    break;

            }
        }


    }
    static void menu(){
        System.out.println("Натисніть 1, щоб Вивести toString() даних елементів масиву на консоль.");
        System.out.println("Натисніть 2, щоб Для всіх об`єктів даного масиву засетити одинаковий  об`єкт класу Авто");
    }
}

