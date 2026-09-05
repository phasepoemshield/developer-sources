/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07078
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07078;

public class class11699
extends class11697 {
    public Object N_0;

    public class11699(String string, boolean bl) {
        super(string, bl);
        this.u();
    }

    private void u() {
    }

    @Override
    public boolean N() {
        this.u();
        return !((class03448)((class06202)this.y_0).T_3).method_8333((class07049)((class04453)((class06202)this.y_0).T_4), ((class04453)((class06202)this.y_0).T_4).method_5829().M((double)((Float)((class11504)this.N_0).i()).floatValue()), class070492 -> class070492.method_5864() == class07078.yI || class070492.method_5864() == class07078.yg).isEmpty();
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.u();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"distance-to-tnt", (float)5.0f, (float)3.0f, (float)60.0f, (float)1.0f).N((T class115362) -> this.U());
    }
}

