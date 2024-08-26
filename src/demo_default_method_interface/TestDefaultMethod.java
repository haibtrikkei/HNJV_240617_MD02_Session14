package demo_default_method_interface;

public interface TestDefaultMethod {
    default int cong(int a, int b){
        return a+b;
    }

    default  int tru(int a, int b){
        return a-b;
    }
}
