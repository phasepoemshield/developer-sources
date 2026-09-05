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
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import minecraft.class04453;
import minecraft.class06202;

public class class11681
extends class11697 {
    public Object N_0;

    private void M() {
    }

    public class11681(String string, boolean bl) {
        super(string, bl);
        this.M();
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.M();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"fall-distance", (float)10.0f, (float)10.0f, (float)60.0f, (float)5.0f).N(class115362 -> this.U());
    }

    @Override
    public boolean N() {
        this.M();
        return !((class04453)((class06202)this.y_0).T_4).method_6128() && ((class04453)((class06202)this.y_0).T_4).field_6017 >= (double)((Float)((class11504)this.N_0).i()).floatValue();
    }
}

