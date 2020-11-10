package ua.lviv.lgs.Enumeraion;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    enum Season{
        WINTER, SPRING, SUMMER, AUTUMN
    }
    enum Months{
        JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER,28), MARCH(Season.SPRING,31), APRIL(Season.SPRING,30),
        MAY(Season.SPRING,31), JUNE(Season.SUMMER,30),JULY(Season.SUMMER,31), AUGUST(Season.SUMMER,30),
        SEMPTEMBER(Season.AUTUMN,30), OCTOBER(Season.AUTUMN,31), NOVEMBER(Season.AUTUMN,30), DECEMBER(Season.WINTER,31);

        int days;
        Season season;
        Months (Season season, int days){
            this.season = season;
            this.days = days;
        }

        public Season getSeason() {
            return season;
        }

        public int getDays() {
            return days;
        }
    }
    static void menu(){
        System.out.println("Натисніть 1, щоб Перевірити чи є такий місяць");
        System.out.println("Натисніть 2, щоб Вивести всі місяці з такою ж порою року");
        System.out.println("Натисніть 3, щоб Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Натисніть 4, щоб Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Натисніть 5, щоб Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Натисніть 6, щоб Вивести на екран наступну пору року");
        System.out.println("Натисніть 7, щоб Вивести на екран попередню пору року");
        System.out.println("Натисніть 8, щоб Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Натисніть 9, щоб Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Натисніть 10, щоб Вивести на екран чи введений з консолі місяць має парну кількість днів");
    }

    public static void main(String[] args) {
        ArrayList<Months> mon = new ArrayList();
        ArrayList<Season> sea = new ArrayList();
        for (Months months:Months.values()){
            mon.add(months);
        }
        for (Season season:Season.values()){
            sea.add(season);
        }
        Scanner sc = new Scanner(System.in);
        while (true){
            menu();
            switch (sc.next()){
                case "1": {
                    System.out.println("Введіть місяць: ");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();
                    boolean flag = isFlag(mon, month);
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
                case "2":{
                    System.out.println("Введіть пору року: ");
                    sc = new Scanner(System.in);
                    String seasonsc = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months c: mon){
                        if (c.getSeason().name().equals(seasonsc)){
                            flag = true;

                        }
                    }
                    if (flag){
                        Season se = Season.valueOf(seasonsc);
                        for (Months mont: mon){
                            if (mont.getSeason().toString().equalsIgnoreCase(seasonsc)){
                                System.out.println(mont);
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
                case "3":{
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    int daysc = sc.nextInt();
                    boolean flag = false;
                    for (Months c: mon){
                        if (c.getDays() == daysc){
                            flag = true;

                        }
                    }
                    if (flag){

                        for (Months mont: mon){
                            if (mont.getDays() == daysc){
                                System.out.println(mont);
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
                case "4":{
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    int daysc = sc.nextInt();
                    boolean flag = false;
                    for (Months c: mon){
                        if (c.getDays() < daysc){
                            flag = true;

                        }
                    }
                    if (flag){

                        for (Months mont: mon){
                            if (mont.getDays() < daysc){
                                System.out.println(mont);
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;

                }
                case "5":{
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    int daysc = sc.nextInt();
                    boolean flag = false;
                    for (Months c: mon){
                        if (c.getDays() > daysc){
                            flag = true;

                        }
                    }
                    if (flag){

                        for (Months mont: mon){
                            if (mont.getDays() > daysc){
                                System.out.println(mont);
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;

                }
                case "6": {
                    System.out.println("Введіть пору року: ");
                    sc = new Scanner(System.in);
                    String seasonsc = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Season c: sea){
                        if (c.name().equals(seasonsc)){
                            flag = true;

                        }
                    }
                    if (flag){
                        Season season = Season.valueOf(seasonsc);
                        int ordinal = season.ordinal();
                        if (ordinal == (sea.size() -1)){
                            ordinal=0;
                            System.out.println(sea.get(ordinal));
                        }else{
                            System.out.println(sea.get(ordinal+1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Введіть пору року: ");
                    sc = new Scanner(System.in);
                    String seasonsc = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Season c: sea){
                        if (c.name().equals(seasonsc)){
                            flag = true;

                        }
                    }
                    if (flag){
                        Season season = Season.valueOf(seasonsc);
                        int ordinal = season.ordinal();
                        if (ordinal == 0){
                            ordinal=3;
                            System.out.println(sea.get(ordinal));
                        }else{
                            System.out.println(sea.get(ordinal-1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
                case "8":{
                    for (Months month : mon){
                        if (month.getDays()%2==0){
                            System.out.println(month.name());
                        }
                    }
                    break;
                }
                case "9":{
                    for (Months month : mon){
                        if (month.getDays()%2==1){
                            System.out.println(month.name());
                        }
                    }
                    break;
                }
                case "10": {
                    System.out.println("Введіть місяць: ");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();
                    boolean flag = isFlag(mon, month);
                    if (flag){
                        Months month2 = Months.valueOf(month);
                        if (month2.getDays() % 2 == 0) {
                            System.out.println("Введено місяць з парною кількістю днів");
                        } else {
                            System.out.println("Введено місяць з непарною кількістю днів");
                        }
                    }
                    if (!flag) {
                        System.out.println("Month doesnt exist");
                    }
                    break;
                }
            }
        }
    }




    private static boolean isFlag(ArrayList<Months> mon, String month) {
        boolean flag = false;
        for (Months c:mon){
            if (c.name().equals(month)){
                System.out.println("Month exist");
                flag = true;

            }
        }
        return flag;
    }
}

