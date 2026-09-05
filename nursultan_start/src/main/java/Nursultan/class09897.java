/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09830
 *  Nursultan.class10021
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09830;
import Nursultan.class09915;
import Nursultan.class09980;
import Nursultan.class10007;
import Nursultan.class10021;
import Nursultan.class10049;

final class class09897 {
    private final class10007 N;

    private static boolean L(class09980 class099802) {
        return class09662.R((int)class099802.o());
    }

    class09897(class10007 class100072) {
        this.N = class100072;
    }

    static boolean y(class09980 class099802) {
        return class099802.K() > 0.01f && class099802.f() > 0.001f && class09662.R((int)class099802.V());
    }

    static boolean N(class09980 class099802) {
        return class099802.q() > 0.01f && class099802.f() > 0.001f;
    }

    private static boolean N(class10021 class100212, class09915 class099152) {
        if (class100212.c().B() <= 0.0f || class100212.c().Z() <= 0.0f) {
            return false;
        }
        if (class100212.y() == class10049.TEXT) {
            return !class100212.B().isEmpty();
        }
        if (class100212.y() == class10049.INPUT) {
            return !class099152.N().L().isEmpty();
        }
        if (class100212.y() == class10049.TEXTURE) {
            return !class100212.z().isEmpty();
        }
        return false;
    }

    private static boolean N(class10021 class100212) {
        return class100212.y() == class10049.CANVAS && class100212.U() != null && class100212.c().u() > 0.0f && class100212.c().i() > 0.0f;
    }

    boolean N(class10021 class100212, class09980 class099802, class09830 class098302, class09915 class099152) {
        if (class100212.y() == class10049.CANVAS) {
            return class09897.N(class099802) || class09897.N(class100212);
        }
        if (class09897.N(class099802)) {
            return true;
        }
        if (class09897.y(class099802)) {
            return true;
        }
        if (class09897.L(class099802)) {
            return true;
        }
        if (class099802.m() > 0.0f && class09662.R((int)class099802.e())) {
            return true;
        }
        if (class09897.N(class100212, class099152)) {
            return true;
        }
        if (class099152.y()) {
            return true;
        }
        return this.N.N(class100212, class099802, class098302);
    }
}

