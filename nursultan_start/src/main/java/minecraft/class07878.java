/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07080
 */
package minecraft;

import minecraft.class07080;

public class class07878
extends RuntimeException {
    private final class07080 N;

    public class07878(class07080 class070802) {
        this.N = class070802;
    }

    @Override
    public Throwable getCause() {
        return this.N.y();
    }

    @Override
    public String getMessage() {
        return this.N.N();
    }

    public class07080 N() {
        return this.N;
    }
}

