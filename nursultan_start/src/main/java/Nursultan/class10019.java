/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09969
 */
package Nursultan;

import Nursultan.class09969;
import Nursultan.class10021;

public final class class10019 {
    public static boolean L(class10021 class100212) {
        if (class100212 == null) {
            return false;
        }
        class09969 class099692 = class100212.o().s();
        return class099692 == class09969.FLOATING || class099692 == class09969.FIXED;
    }

    private class10019() {
    }

    public static boolean y(class10021 class100212) {
        if (class100212 == null) {
            return false;
        }
        return class100212.o().s() == class09969.FLOW;
    }

    public static boolean N(class10021 class100212) {
        return class100212 != null && class100212.o().s() == class09969.FIXED;
    }
}

