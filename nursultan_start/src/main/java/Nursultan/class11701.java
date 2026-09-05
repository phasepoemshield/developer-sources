/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07047
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07047;

public class class11701
extends class11697 {
    public Object N_0;

    public class11701(String string, boolean bl) {
        super(string, bl);
        this.u();
    }

    private void u() {
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.u();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"health", (float)3.0f, (float)1.0f, (float)20.0f, (float)0.5f).N(class115362 -> this.U());
    }

    @Override
    public boolean N() {
        this.u();
        float f = ((class04453)((class06202)this.y_0).T_4).method_6032();
        if (((class04453)((class06202)this.y_0).T_4).method_6059(class07047.t)) {
            f += ((class04453)((class06202)this.y_0).T_4).method_6067();
        }
        return f < ((Float)((class11504)this.N_0).i()).floatValue();
    }
}

