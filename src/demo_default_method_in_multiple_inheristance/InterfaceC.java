package demo_default_method_in_multiple_inheristance;

public interface InterfaceC extends InterfaceA,InterfaceB{
    @Override
    default int cong(int a, int b) {
        return InterfaceB.super.cong(a, b);
    }
}
