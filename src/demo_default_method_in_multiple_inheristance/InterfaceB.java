package demo_default_method_in_multiple_inheristance;

public interface InterfaceB {
    default int cong(int a, int b){
        a = a+5;
        b = b + 10;
        return a+b;
    }
}
