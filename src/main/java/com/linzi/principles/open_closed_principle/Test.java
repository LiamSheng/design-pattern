package com.linzi.principles.open_closed_principle;

public class Test {
    public static void main(String[] args) {
        DefaultSpecificSkin defaultSpecificSkin = new DefaultSpecificSkin();
        HeimaSpecificSkin heimaSpecificSkin = new HeimaSpecificSkin();

        SouGouInput souGouInput = new SouGouInput(heimaSpecificSkin);
        souGouInput.display();
    }
}
