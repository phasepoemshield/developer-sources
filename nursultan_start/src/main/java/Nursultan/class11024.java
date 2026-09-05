/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Scaffold
 *  Nursultan.class11385
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11899
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.Scaffold;
import Nursultan.class11385;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11899;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08687;

public class class11024
extends class11807<Scaffold> {
    public class11024(Scaffold scaffold, String string, boolean bl) {
        super((Object)scaffold, string, bl);
    }

    public void y(Object object) {
        if (!(object instanceof class11385)) {
            return;
        }
        class11385 class113852 = (class11385)object;
        if (!((class04453)((class06202)((class11798)this).N_0).T_4).method_24828() || !this.N()) {
            return;
        }
        class113852.y(true);
    }

    private boolean N() {
        class08687[] class08687Array = new class08687[]{new class08687(true, false, false, false, false, false, false), new class08687(false, true, false, false, false, false, false)};
        int n = class08687Array.length;
        for (int i = 0; i < n; ++i) {
            if (class11899.N((class08687)class08687Array[i], (int)3).u().i().method_24828()) continue;
            return true;
        }
        return false;
    }
}

