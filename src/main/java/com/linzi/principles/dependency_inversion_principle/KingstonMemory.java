package com.linzi.principles.dependency_inversion_principle;

public class KingstonMemory implements Memory {

    public void save() {
        System.out.println("使用了 KingstonMemory");
    }

}
