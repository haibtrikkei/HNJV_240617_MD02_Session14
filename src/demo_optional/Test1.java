package demo_optional;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        Optional<Student> stu = null;
        stu.orElseThrow();
        System.out.println("Continue...");
    }
}
