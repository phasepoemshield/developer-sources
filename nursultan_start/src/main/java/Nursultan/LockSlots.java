/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11358
 *  Nursultan.class11368
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08044
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11358;
import Nursultan.class11368;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08044;

@class11080(L="LockSlots", y=class11072.PLAYER, N=class11106.BASE)
public class LockSlots
extends class11067 {
    public Object L_0;
    public Object L_1;

    private void T() {
    }

    public LockSlots() {
        this.T();
        this.L_0 = class11524.y((class11512)this, (String)"slots", (class11535[])new class11535[]{new class11535("_1", true), new class11535("_2", true), new class11535("_3", true), new class11535("_4", true), new class11535("_5", true), new class11535("_6", true), new class11535("_7", true), new class11535("_8", true), new class11535("_9", true)});
        this.L_1 = class11524.N((class11512)this, (String)"from-inventory", (boolean)false);
    }

    private boolean y(int n) {
        this.T();
        return class08044.L((int)n) && ((class11535)((class11523)this.L_0).L().get(n)).U();
    }

    @class11782
    public void N(class11358 class113582) {
        if (this.y(class113582.L())) {
            class113582.N();
        }
    }

    @class11782
    public void N(class11368 class113682) {
        this.T();
        if (class113682.M() != class07510.field_7795 && (class113682.M() != class07510.field_7790 || class113682.B() != -999)) {
            return;
        }
        if (((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            class113682.N();
            return;
        }
        if ((class04453)((class06202)this.y_0).T_4 != null && this.y(LockSlots.N(class113682.L(), ((class04453)((class06202)this.y_0).T_4).method_31548(), (class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2))) {
            class113682.N();
        }
    }

    private static int N(class06937 class069372, class08044 class080442, class07482 class074822) {
        if (class069372 == null || class069372.L != class080442) {
            return -1;
        }
        int n = class069372.B();
        if (class08044.L((int)n)) {
            return n;
        }
        if (class074822 == null || class069372.u < 0 || class069372.u >= class074822.T.size()) {
            return -1;
        }
        class06937 class069373 = (class06937)class074822.T.get(class069372.u);
        if (class069373.L != class080442) {
            return -1;
        }
        int n2 = class069373.B();
        return class08044.L((int)n2) ? n2 : -1;
    }
}

