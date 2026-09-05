/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11303
 *  Nursultan.class11368
 *  Nursultan.class11826
 *  Nursultan.class11894
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class11303;
import Nursultan.class11368;
import Nursultan.class11826;
import Nursultan.class11894;
import Nursultan.class11938;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07510;

public class class09344
implements class11826<class11368> {
    private void L(class11368 class113682) {
        if (!(((Boolean)class11938.L_3).booleanValue() && class06202.Nq().U() && class06202.Nq().s() && class06202.Nq().L())) {
            return;
        }
        class113682.N();
        class06584 class065842 = class113682.L().i();
        if (class065842.R()) {
            return;
        }
        class00405 class004052 = class00405.N.N((class00647)new class00623(class11894.L((class06584)class065842).toAbsolutePath().toString()));
        class11303.N((Object)class00392.y((String)"Parsed item: ").y(class065842.Y()).L(class004052));
    }

    private void y(class11368 class113682) {
        if (class113682.L() == null) {
            return;
        }
        class06584 class065842 = class113682.L().i();
        if (class065842.R()) {
            return;
        }
        class06581 class065812 = class065842.B();
        if (class113682.M() != class07510.field_7795 || !class06202.Nq().s() || !class06202.Nq().L()) {
            return;
        }
        for (class06937 class069372 : class113682.i().T) {
            if (!class069372.i().N(class065812)) continue;
            class11938.m().N(class113682.u(), class069372.u, 1, class07510.field_7795).y();
        }
    }

    public void listen(class11368 class113682) {
        this.L(class113682);
        this.y(class113682);
    }
}

