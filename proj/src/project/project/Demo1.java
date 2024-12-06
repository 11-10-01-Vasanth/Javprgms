package project.project;
class A {
    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    public static void show() {
        // TODO Auto-generated method stub
        System.out.println("Static show block");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        // A a = new A();
        A.show();
    }
}