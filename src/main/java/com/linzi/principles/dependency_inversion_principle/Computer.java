package com.linzi.principles.dependency_inversion_principle;

public class Computer {

    private XiJieHardDisk xiJieHardDisk;
    private IntelCPU intelCPU;
    private KingstonMemory kingstonMemory;

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCPU getIntelCPU() {
        return intelCPU;
    }

    public void setIntelCPU(IntelCPU intelCPU) {
        this.intelCPU = intelCPU;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run() {
        System.out.println("Computer is running");
        String data = this.xiJieHardDisk.get();
        System.out.println("希捷硬盘上的数据: " + data);
        intelCPU.run();
        kingstonMemory.save();
    }

}
