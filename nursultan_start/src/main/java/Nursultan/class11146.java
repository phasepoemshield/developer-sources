/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoVelocity
 *  Nursultan.class11385
 *  Nursultan.class11387
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11787
 *  Nursultan.class11801
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06652
 */
package Nursultan;

import Nursultan.NoVelocity;
import Nursultan.class11385;
import Nursultan.class11387;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11787;
import Nursultan.class11801;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06652;

public class class11146
extends class11787
implements class11801<NoVelocity> {
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class11146(String string, boolean bl) {
        super(string, bl);
        this.N();
    }

    public void y(Object object) {
        this.N();
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11385.class, class11387.class}, (Object)object3, (int)n)) {
            case 0: {
                class11385 class113852 = (class11385)object3;
                if (((Boolean)this.y_0).booleanValue()) {
                    class113852.M(true);
                    class113852.B(true);
                    class113852.i(true);
                }
                this.y_0 = false;
                break;
            }
            case 1: {
                class06652 class066522 = ((class11387)object3).N();
                if ((class04453)((class06202)this.N_0).T_4 == null || !((class04453)((class06202)this.N_0).T_4).method_5624() || !(class066522.y().B >= 0.0) || class066522.N() != ((class04453)((class06202)this.N_0).T_4).method_5628() || !(Math.random() * 100.0 <= (double)((Float)((class11504)this.y_1).i()).floatValue())) break;
                this.y_0 = true;
                break;
            }
        }
    }

    private void N() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public void N(NoVelocity noVelocity) {
        this.N();
        this.y_1 = (class11504)class11524.N((class11512)noVelocity, (String)"chance", (float)100.0f, (float)1.0f, (float)100.0f, (float)1.0f).N((Supplier)class11502.N_0).N(class115362 -> this.U());
    }
}

