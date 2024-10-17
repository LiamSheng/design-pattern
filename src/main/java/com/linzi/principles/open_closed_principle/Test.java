package com.linzi.principles.open_closed_principle;

public class Test {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象.
        SouGouInput souGouInput = new SouGouInput();

        //2.业务逻辑初期选择使用默认皮肤.
        DefaultSpecificSkin defaultSpecificSkin = new DefaultSpecificSkin();
        souGouInput.setSkin(defaultSpecificSkin);
        souGouInput.display();

        //3.业务逻辑需要修改转为使用黑马皮肤.
        HeimaSpecificSkin heimaSpecificSkin = new HeimaSpecificSkin();
        souGouInput.setSkin(heimaSpecificSkin);
        souGouInput.display();
    }
}
