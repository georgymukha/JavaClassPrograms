package com.java.class13;

public class InstanceMethod {
    public static void main(String[] args) {
        print();

        InstanceMethod someVarName = new InstanceMethod();
        someVarName.printInstance();
    }

    public static void print() {
        System.out.println("Hello Method");
    }

    public void printInstance() {
        System.out.println("Hello Instance Method");
    }
}
