/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09937
 *  Nursultan.class09980
 *  Nursultan.class10019
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09937;
import Nursultan.class09980;
import Nursultan.class10019;
import Nursultan.class10021;

final class class09839 {
    private class09839() {
    }

    private static boolean N(class10021 class100212, float f, float f2, float f3) {
        float f4 = class10019.N((class10021)class100212) ? 0.0f : f;
        float f5 = class10019.N((class10021)class100212) ? 0.0f : f2;
        class09980 class099802 = class100212.o();
        class09937 class099372 = class100212.c();
        float f6 = f4 + class099802.n().L(class099372.u());
        float f7 = f5 + class099802.t().L(class099372.i());
        boolean bl = false;
        if (f6 != 0.0f || f7 != 0.0f) {
            float f8 = class09693.N((float)(class099372.y() + f6), (float)f3) - class099372.y();
            float f9 = class09693.N((float)(class099372.L() + f7), (float)f3) - class099372.L();
            if (f8 != 0.0f || f9 != 0.0f) {
                class099372.L(class099372.y() + f8, class099372.L() + f9);
                class099372.N(class099372.R() + f8, class099372.M() + f9, class099372.B(), class099372.Z());
                class100212.i(1);
                bl = true;
            }
        }
        for (int i = 0; i < class100212.u(); ++i) {
            bl |= class09839.N(class100212.N(i), f6, f7, f3);
        }
        return bl;
    }

    static boolean N(class10021 class100212, float f) {
        return class09839.N(class100212, 0.0f, 0.0f, f);
    }

    static void N(class10021 class100212) {
        class09937 class099372 = class100212.c();
        if (class099372.y() != class099372.l() || class099372.L() != class099372.d()) {
            float f = class099372.R() - class099372.y();
            float f2 = class099372.M() - class099372.L();
            class099372.L(class099372.l(), class099372.d());
            class099372.N(class099372.l() + f, class099372.d() + f2, class099372.B(), class099372.Z());
            class100212.i(1);
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class09839.N(class100212.N(i));
        }
    }
}

