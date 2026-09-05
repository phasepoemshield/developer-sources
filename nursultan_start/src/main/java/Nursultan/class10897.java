/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00509
 *  minecraft.class00696
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07299
 */
package Nursultan;

import Nursultan.class10932;
import Nursultan.class10990;
import minecraft.class00381;
import minecraft.class00509;
import minecraft.class00696;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07299;

public class class10897
extends class10932 {
    public class10897(String string, boolean bl) {
        super(string, bl);
    }

    @Override
    public void y(Object object) {
        class00696 class006962;
        class00509 class005092;
        class10990 class109902;
        block6: {
            block5: {
                if (!this.U() || !(object instanceof class10990)) break block5;
                class109902 = (class10990)((Object)object);
                if ((class03448)((class06202)this.N_0).T_3 != null && (class04453)((class06202)this.N_0).T_4 != null) break block6;
            }
            return;
        }
        class00381<?> var4 = class109902.u();
        if (!(var4 instanceof class00509) || (class005092 = (class00509)var4).N() != 31) {
            return;
        }
        class07049 class070492 = class005092.N((class07299)((class03448)((class06202)this.N_0).T_3));
        if (class070492 instanceof class00696 && (class006962 = (class00696)class070492).u() == (class04453)((class06202)this.N_0).T_4) {
            class109902.N();
        }
    }
}

