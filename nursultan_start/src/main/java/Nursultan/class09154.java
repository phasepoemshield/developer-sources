/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11079
 *  Nursultan.class11122
 *  Nursultan.class11315
 *  Nursultan.class11385
 *  Nursultan.class11895
 *  Nursultan.class11899
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09164;
import Nursultan.class11079;
import Nursultan.class11122;
import Nursultan.class11315;
import Nursultan.class11385;
import Nursultan.class11895;
import Nursultan.class11899;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08687;

public class class09154
extends class11122 {
    private static double[] L;

    public class09154(AttackAura attackAura, String string, boolean bl) {
        super(attackAura, string, bl);
    }

    static {
        class09154.R();
    }

    public boolean N() {
        return false;
    }

    public boolean N(class07438 class074382) {
        return ((AttackAura)((class09164)((Object)this)).y_0).N(class11895.N((class07049)class074382), ((AttackAura)((class09164)((Object)this)).y_0).m());
    }

    public void N(class11385 class113852) {
        super.N(class113852);
        class07438 class074382 = ((AttackAura)((class09164)((Object)this)).y_0).v();
        if (!((AttackAura)((class09164)((Object)this)).y_0).N(class11895.N((class07049)class074382), ((AttackAura)((class09164)((Object)this)).y_0).m() - L[0])) {
            class113852.R(true);
        }
        if (class11899.N((class08687)class113852.z(), (int)4).u().i().field_5976) {
            class113852.i(true);
        }
        if (!class11315.N((int)(((class11079)((AttackAura)((class09164)((Object)this)).y_0).P().i()).N() - 1)) || class113852.L()) {
            class113852.B(true);
        }
    }

    private static void R() {
        L = new double[1];
        class09154.L[0] = Double.longBitsToDouble(4609434218613702656L);
    }
}

