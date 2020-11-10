package ua.lviv.lgs.CarHomework;

public class Car {
    public int getNumberOfHorsepower() {
        return NumberOfHorsepower;
    }

    public int getDate() {
        return year;
    }

    private int NumberOfHorsepower;
    private int year;
    private Helm helm;
    private Engine engine;

    public Helm getHelm() {
        return helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(int numberOfHorsepower, int year, Helm helm, Engine engine) {
        NumberOfHorsepower = numberOfHorsepower;
        this.year = year;
        this.helm = helm;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfHorsepower=" + NumberOfHorsepower +
                ", year=" + year +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
