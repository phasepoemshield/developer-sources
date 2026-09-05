/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06889
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06889;

public class class06331 {
    private final class06889 N;
    private final class06889 y;
    private final Predicate<class00500> L;

    public Predicate<class00500> L() {
        return this.L;
    }

    public class06331(class06889 class068892, class06889 class068893, Predicate<class00500> predicate) {
        this.N = class068892;
        this.y = class068893;
        this.L = predicate;
    }

    public class06889 y() {
        return this.N;
    }

    public class06889 N() {
        return this.y;
    }
}

