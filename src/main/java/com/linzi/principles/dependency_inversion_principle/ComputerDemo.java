package com.linzi.principles.dependency_inversion_principle;

public class ComputerDemo {
    public static void main(String[] args) {
        IntelCPU iCpu = new IntelCPU();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();

        Computer computer = new Computer();
        computer.setIntelCPU(iCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHardDisk(xiJieHardDisk);
        computer.run();
    }
}
