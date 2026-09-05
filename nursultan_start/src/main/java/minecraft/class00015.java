/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00030
 *  minecraft.class00471
 *  minecraft.class02195
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class08122
 */
package minecraft;

import minecraft.class00030;
import minecraft.class00471;
import minecraft.class02195;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class08122;

public class class00015
extends class00471<class00015> {
    private class03530<class04748> N = class00030.N;
    private class03556<class02195> y = class00030.y;
    private byte L = (byte)2;
    private int u = 50;
    private boolean i = true;

    public class08122 y() {
        return new class00030(this.R(), this.N, this.y, this.L, this.u, this.i);
    }

    public class00015 N(int n) {
        this.u = n;
        return this;
    }

    public class00015 N(boolean bl) {
        this.i = bl;
        return this;
    }

    public class00015 N(byte by) {
        this.L = by;
        return this;
    }

    protected class00015 L() {
        return this;
    }

    public class00015 N(class03556<class02195> class035562) {
        this.y = class035562;
        return this;
    }

    public class00015 N(class03530<class04748> class035302) {
        this.N = class035302;
        return this;
    }
}

