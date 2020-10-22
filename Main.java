import Interface.InterfaceA;
import Class.ClassA;

public class Main {
    public static void main(String[] args){
        InterfaceA inA = new ClassA();
        inA.method1();
        inA.method2();
        inA.method3();
    }
}
