/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00471
 *  minecraft.class03556
 *  minecraft.class06378
 *  minecraft.class07304
 *  minecraft.class08122
 */
package minecraft;

import minecraft.class00471;
import minecraft.class03556;
import minecraft.class06378;
import minecraft.class06706;
import minecraft.class07304;
import minecraft.class08122;

public class class06700
extends class00471<class06700> {
    private final class03556<class07304> N;
    private final class06378 y;
    private int L = 0;

    public class06700(class03556<class07304> class035562, class06378 class063782) {
        this.N = class035562;
        this.y = class063782;
    }

    public class08122 y() {
        return new class06706(this.R(), this.N, this.y, this.L);
    }

    protected class06700 L() {
        return this;
    }

    public class06700 N(int n) {
        this.L = n;
        return this;
    }
}

