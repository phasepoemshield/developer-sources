/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  Nursultan.class11281
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07047
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11281;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07047;

public class class11713
extends class11697 {
    public Object N_0;

    public class11713(String string, boolean bl) {
        super(string, bl);
        this.i();
    }

    private void i() {
    }

    @Override
    public boolean N() {
        this.i();
        if (!class11281.y((class06581)class06570.sT)) {
            return false;
        }
        float f = ((class04453)((class06202)this.y_0).T_4).method_6032();
        if (((class04453)((class06202)this.y_0).T_4).method_6059(class07047.t)) {
            f += ((class04453)((class06202)this.y_0).T_4).method_6067();
        }
        return f < ((Float)((class11504)this.N_0).i()).floatValue();
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.i();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"elytra-health", (float)3.0f, (float)1.0f, (float)20.0f, (float)0.5f).N(class115362 -> this.U());
    }
}

