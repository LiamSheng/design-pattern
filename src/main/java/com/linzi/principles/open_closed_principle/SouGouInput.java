package com.linzi.principles.open_closed_principle;

/**
 * The type Sou gou input.
 */
public class SouGouInput {

    private AbstractSkin skin;

    // aggregation
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        this.skin.display();
    }

}
