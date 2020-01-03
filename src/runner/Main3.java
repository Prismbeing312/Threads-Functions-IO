package runner;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
//        Predicate<String> isTrue = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equalsIgnoreCase("Jake");
//            }
//        };
//        String name = "Jake";
//
//        Runnable run = () -> System.out.println("Working");
//
//        ifTrueRun(isTrue, name, run);
//
//        BiFunction<Integer, Integer, Integer> add = (x , y) -> x+y;
//
//        System.out.println(add.apply(4, 5));

//        BiFunction<Integer, Integer, Integer> something = (x , y) -> x + y;
//        int a = something.andThen(x -> x * 4).andThen(y -> y + 5).apply(2, 3);
//        System.out.println(a);

        Function<Integer, Integer> add3 = add(3);
        System.out.println(add3.apply(5));


    }

    public static Function<Integer, Integer> add(int num){
        return (num2) -> num + num2;
    }


//    public static void ifTrueRun(Predicate<String> isTrue, String name, Runnable runnable) {
//        if (isTrue.test(name)) {
//            runnable.run();
//        } else {
//            System.out.println("Omer is gay");
//        }
//    }
}

