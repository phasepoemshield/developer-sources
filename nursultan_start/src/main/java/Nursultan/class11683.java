/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11910
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11787;
import Nursultan.class11910;
import minecraft.class04453;
import minecraft.class06202;

public class class11683
extends class11787 {
    public Object y_0;

    public class11683(String string, boolean bl) {
        super(string, bl);
        this.N();
        this.y_0 = new String[]{"/bal", "/baltop", "/rg"};
    }

    public void y(Object object) {
        this.N();
        if (object instanceof class10992) {
            int n = ((class04453)((class06202)this.N_0).T_4).method_59922().y(((String[])this.y_0).length);
            class11910.N((String)((String[])this.y_0)[n]);
        }
    }

    private void N() {
    }
}

