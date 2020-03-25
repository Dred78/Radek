package pl.javastart.first;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class LiczbyParzysteData {

    public static void main (String args[])
    {
        for(int a=0;a<10;a++) {
            if(a%2==0) {
                System.out.println("Parzyste: "+a);
            }
        }

        IntStream.range(0, 20)
                .filter(value -> value%2 ==0)
                .forEach(value -> System.out.println("Parzyste: "+value));



        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

}
