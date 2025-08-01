package commonProblems_AKA_zadachki.lambdas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class mapFunc {

    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        //list.stream().map(number -> number * 3).forEach(System.out::println);

        String[] argss = {"Halo", "Shalom", "Bonjour", "Привет"};
        List<String> arar = Arrays.asList(argss);
        arar.stream().map((el)->el=el+"GJ").forEach(System.out::println);

    }
}
