package stream.example;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rose", "Daffodil", "Marigold", "Dalhia");
        System.out.println("iterate using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("iterate using for each loop");
        for (String flower : list) {
            if (flower.startsWith("D")) {
                System.out.println(flower);
            }
        }
            System.out.println("iterate using Stream for each loop");
            list.stream()
                    .filter(flower -> flower.startsWith("D"))
                    .forEach(flower -> System.out.println(flower));
        }

    }
