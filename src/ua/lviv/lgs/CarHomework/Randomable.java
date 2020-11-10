package ua.lviv.lgs.CarHomework;
import java.util.Random;

public interface Randomable {
    static int getRandomValueFromRange(int min, int max){
        if (min>=max){
            throw new IllegalArgumentException("min value must be smaller than max value");
        }
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
}

