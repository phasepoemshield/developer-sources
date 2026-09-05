/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11328
 *  Nursultan.class11400
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11819
 *  Nursultan.class12002
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11328;
import Nursultan.class11400;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11542;
import Nursultan.class11819;
import Nursultan.class12002;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

public abstract class class11553<T extends class11067>
implements class11819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    public abstract class11328 L();

    private void M() {
    }

    public class11553(T t, String string) {
        this.M();
        this.N_0 = class06202.Nq();
        this.N_1 = t;
        this.N_2 = class11524.N(t, (String)string, (class12002)class12002.UNKNOWN);
    }

    public abstract String u();

    public void y(Object object) {
        if (!(object instanceof class11400)) {
            return;
        }
        class11400 class114002 = (class11400)object;
        if (!class114002.y((class12002)((class11527)this.N_2).i(), ((class11527)this.N_2).L())) {
            return;
        }
        if (((class11067)this.N_1).U() && (class04453)((class06202)this.N_0).T_4 != null && (class03448)((class06202)this.N_0).T_3 != null) {
            ((class11542)((class11067)this.N_1)).N(this.L());
        }
    }

    public abstract class06584 y();

    public abstract String N();
}

