/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09915;

final class class09910 {
    private class09915 N = class09915.N;
    private boolean y;
    private int L;

    class09910() {
    }

    int N(class09915 class099152) {
        class09915 class099153;
        class09915 class099154 = class099153 = class099152 == null ? class09915.N : class099152;
        if (!this.y || !this.N.equals((Object)class099153)) {
            this.N = class099153;
            this.y = true;
            ++this.L;
        }
        return this.L;
    }
}

