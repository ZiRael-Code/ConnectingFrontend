package com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service;

import javax.tools.JavaCompiler;

public class AsserEquals <T>{
    @Test
    public void assertEquals(T i, T b){
        if (i instanceof Integer && b instanceof Integer) {
            System.out.println(i == b ? "---------------------\nTest passed\n------------------" : "---------------------\nTest Failled\n------------------");
        } else if (i instanceof String && b instanceof String) {
            System.out.println(i.equals(b) ? "---------------------\nTest passed\n------------------" : "---------------------\nTest Failled\n------------------");
        } else if (i instanceof Object && b instanceof Object) {
            System.out.println(i.equals(b) ? "---------------------\nTest passed\n------------------" : "---------------------\nTest Failled\n------------------");
        }
    }
}
