/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TapeMouse
 *  Nursultan.class11380
 *  Nursultan.class11467
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11801
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.TapeMouse;
import Nursultan.class11380;
import Nursultan.class11467;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11801;
import java.util.function.Supplier;
import minecraft.class06202;

public class class11154
extends class11535
implements class11801<TapeMouse> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;

    public class11154(String string, boolean bl, String string2, Runnable runnable) {
        super(string, bl);
        this.i();
        this.N_0 = class06202.Nq();
        this.N_1 = new class11467();
        this.N_2 = string2;
        this.N_3 = runnable;
    }

    static {
        class11154.N();
    }

    private void i() {
    }

    private static void N() {
    }

    public void N(class11380 class113802) {
        this.i();
        if (!((class11467)this.N_1).N((long)(((Float)((class11504)this.N_4).i()).floatValue() * 1000.0f))) {
            return;
        }
        ((Runnable)this.N_3).run();
        ((class11467)this.N_1).N();
    }

    public void N(TapeMouse tapeMouse) {
        this.i();
        this.N_4 = (class11504)class11524.N((class11512)tapeMouse, (String)((String)this.N_2), (float)5.0f, (float)0.1f, (float)120.0f, (float)0.1f).N((Supplier)class11502.N_2).N(class115362 -> this.U());
    }
}

