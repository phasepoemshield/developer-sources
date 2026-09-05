/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11787
 *  minecraft.class00381
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06652
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11787;
import minecraft.class00381;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06652;

public class class11138
extends class11787 {
    public class11138(String string, boolean bl) {
        super(string, bl);
    }

    public void y(Object object) {
        if (!(object instanceof class10990)) {
            return;
        }
        class10990 class109902 = (class10990)object;
        class00381 var3 = class109902.u();
        if (!(var3 instanceof class06652) || ((class06652)var3).N() != ((class04453)((class06202)this.N_0).T_4).method_5628()) {
            return;
        }
        class109902.N();
    }
}

