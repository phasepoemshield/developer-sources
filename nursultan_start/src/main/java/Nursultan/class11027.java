/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Scaffold
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11534
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.Scaffold;
import Nursultan.class11019;
import Nursultan.class11053;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11534;
import minecraft.class06889;

public class class11027
extends class11053 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11027(Scaffold scaffold, String string, boolean bl) {
        super(scaffold, string, bl);
        this.W();
    }

    @Override
    public void N(class11499 class114992, boolean bl) {
        this.W();
        if (bl) {
            class11534.y((class11499)class114992);
            this.N_0 = Float.valueOf(class114992.y());
            this.N_1 = true;
        } else if (((Boolean)this.N_1).booleanValue()) {
            this.N_1 = false;
        }
    }

    @Override
    public class11499 N(class11019 class110192, class06889 class068892, class11499 class114992) {
        this.W();
        class11499 class114993 = class11505.N().N(class114992);
        if (Math.abs(((Float)this.N_0).floatValue() - class114993.y()) <= 0.1f) {
            class114993 = class114993.N(0.11f, 0.0f);
        }
        return class114993.N(true);
    }

    private void W() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = false;
        }
    }
}

