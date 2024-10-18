package com.linzi.principles.dependency_inversion_principle;

public class ComputerDemo {
    public static void main(String[] args) {
        CPU cpu = new IntelCPU();
        Memory memory = new KingstonMemory();
        HardDisk hardDisk = new XiJieHardDisk();

        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
