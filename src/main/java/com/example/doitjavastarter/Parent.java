package com.example.doitjavastarter;

public class Parent {
    void method1(){}
    void  method2(){}

    class child extends Parent{
        @Override
        void method2(){}
        void method3(){}
    }
}
