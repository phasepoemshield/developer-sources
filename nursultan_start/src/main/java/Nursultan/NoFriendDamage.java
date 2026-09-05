/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11357
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  minecraft.class00502
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06639
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11357;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11791;
import minecraft.class00502;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06639;
import minecraft.class07049;

@class11080(L="NoFriendDamage", y=class11072.COMBAT, N=class11106.OTHER)
public class NoFriendDamage
extends class11067 {
    public Object L_0;

    private void T() {
    }

    public NoFriendDamage() {
        this.T();
        this.L_0 = class11524.N((class11512)this, (String)"teams", (boolean)false);
    }

    @class11782
    public void N(class11357 class113572) {
        if (class11791.u().test(class113572.L())) {
            class113572.N();
        }
    }

    public boolean N(class07049 class070492) {
        this.T();
        if (!this.U() || !((Boolean)((class11507)this.L_0).i()).booleanValue() || (class04453)((class06202)this.y_0).T_4 == null || class070492 == (class04453)((class06202)this.y_0).T_4) {
            return false;
        }
        class00502 class005022 = ((class04453)((class06202)this.y_0).T_4).method_5781();
        return class005022 != null && class005022.N((class06639)class070492.method_5781());
    }
}

