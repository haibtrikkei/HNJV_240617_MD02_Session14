package method_reference;

import java.util.Arrays;
import java.util.List;

public class DemoMethodReferences {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,3,5,6,3,5,6,3,5,6,3,65,6);
        list.forEach(System.out::println);
    }
}
