package com.linzi.principles.dependency_inversion_principle;

public class Computer {

    private HardDisk hardDisk;
    private CPU cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("Computer is running");
        String data = this.hardDisk.get();
        System.out.println("希捷硬盘上的数据: " + data);
        cpu.run();
        memory.save();
    }

}
