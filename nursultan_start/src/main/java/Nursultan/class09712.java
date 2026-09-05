/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09693;

public final class class09712 {
    private class09712() {
    }

    public static float N(float f, float f2, float f3) {
        float f4 = class09693.N(f3);
        return f + (f2 - f) * f4;
    }

    public static int N(int n, int n2, float f) {
        return class09662.N(n, n2, class09693.N(f));
    }
}

