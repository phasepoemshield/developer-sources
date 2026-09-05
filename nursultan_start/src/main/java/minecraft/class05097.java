/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class05108;

public class class05097
extends Exception {
    public final class05108 N;

    public class05097(class05108 class051082) {
        this.N = class051082;
    }

    @Override
    public String getMessage() {
        return this.N.L();
    }
}

