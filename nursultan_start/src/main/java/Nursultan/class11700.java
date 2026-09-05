/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoLeave
 *  Nursultan.class10957
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11807
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.AutoLeave;
import Nursultan.class10957;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11798;
import Nursultan.class11801;
import Nursultan.class11807;
import minecraft.class04453;
import minecraft.class06202;

public class class11700
extends class11807<AutoLeave>
implements class11801<AutoLeave> {
    public Object y_0;

    private void L() {
    }

    public class11700(AutoLeave autoLeave, String string, boolean bl) {
        super((Object)autoLeave, string, bl);
        this.L();
    }

    static {
        class11700.N();
    }

    public void y(Object object) {
        this.L();
        if (object instanceof class10957 && ((class04453)((class06202)((class11798)((Object)this)).N_0).T_4).method_6032() < ((Float)((class11504)this.y_0).i()).floatValue()) {
            ((AutoLeave)((class11798)((Object)this)).N_1).m();
        }
    }

    @Override
    public void N(AutoLeave autoLeave) {
        this.L();
        this.y_0 = (class11504)class11524.N((class11512)autoLeave, (String)"health", (float)15.0f, (float)1.0f, (float)20.0f, (float)0.5f).N(class115362 -> this.U());
    }

    private static void N() {
    }
}

