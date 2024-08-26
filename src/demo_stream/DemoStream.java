package demo_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,3,5,6,4,6,7,4,6,7,4,7,8,9,8,6,8,9,4,1,4,2,4);

//        List<Integer> list_even = list.stream().filter(a->a%2==0).collect(Collectors.toList());
        List<Integer> list_even = list.stream().filter(a->a%2==0).toList();
        System.out.println("Cac so chan: ");
        for(Integer n : list_even)
            System.out.print(n+"\t");
        System.out.println();
    }
}
