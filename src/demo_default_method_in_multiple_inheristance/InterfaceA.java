package demo_default_method_in_multiple_inheristance;

public interface InterfaceA {
    default int cong(int a, int b){
        return a+b;
    }
}
