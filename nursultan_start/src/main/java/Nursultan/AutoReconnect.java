/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10917
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11380
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  minecraft.class03448
 *  minecraft.class04190
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10917;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11380;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11910;
import Nursultan.class11938;
import java.util.function.Supplier;
import minecraft.class03448;
import minecraft.class04190;
import minecraft.class06202;

@class11080(L="AutoReconnect", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoReconnect
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;

    public AutoReconnect() {
        this.v();
        this.L_0 = class11524.N((class11512)this, (String)"delay", (float)10.0f, (float)10.0f, (float)300.0f, (float)1.0f).N((Supplier)class11502.N_2);
        this.L_1 = class11524.N((class11512)this, (String)"auto-enable-auto-leave", (boolean)true);
    }

    private void s() {
        this.v();
        if (((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            class11938.u().v().N(true);
        }
    }

    private void v() {
    }

    public void y() {
        this.v();
        this.L_2 = null;
        super.y();
    }

    @class11782
    public void N(class10990 class109902) {
        this.v();
        if (!(class109902.u() instanceof class04190)) {
            return;
        }
        if ((class10917)this.L_2 != null) {
            this.L_2 = null;
            this.s();
            return;
        }
        if ((class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        int n = class11910.M();
        if (n == -1) {
            return;
        }
        this.L_2 = new class10917("/an" + n, class11938.j().y());
    }

    @class11782
    public void N(class11380 class113802) {
        this.v();
        if ((class10917)this.L_2 == null) {
            return;
        }
        int n = class11938.j().y();
        if ((float)n > (float)((class10917)this.L_2).y() + ((Float)((class11504)this.L_0).i()).floatValue() * 20.0f) {
            class11910.N((String)((class10917)this.L_2).N());
            this.L_2 = new class10917(((class10917)this.L_2).N(), n);
        }
    }
}

