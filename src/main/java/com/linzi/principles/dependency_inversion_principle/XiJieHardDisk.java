package com.linzi.principles.dependency_inversion_principle;

public class XiJieHardDisk implements HardDisk {

    public void save(String data) {
        System.out.println("希捷硬盘存储数据: " + data);
    }

    public String get() {
        System.out.println("希捷硬盘读取数据");
        return "data-data-data";
    }

}
