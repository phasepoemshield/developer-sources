/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class01164;
import minecraft.class01187;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class06889;

public final class class01148
implements Comparable<class01148> {
    private final class03556<class01194> N;
    private final class06889 y;
    private final class01164 L;
    private final class01187 u;
    private final double i;

    public class01164 L() {
        return this.L;
    }

    public class01148(class03556<class01194> class035562, class06889 class068892, class01164 class011642, class01187 class011872, class06889 class068893) {
        this.N = class035562;
        this.y = class068892;
        this.L = class011642;
        this.u = class011872;
        this.i = class068892.M(class068893);
    }

    public class01187 u() {
        return this.u;
    }

    public class06889 y() {
        return this.y;
    }

    @Override
    public int compareTo(class01148 class011482) {
        return Double.compare(this.i, class011482.i);
    }

    public class03556<class01194> N() {
        return this.N;
    }
}

