/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02135
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class02135;
import minecraft.class06069;

public final class class04133 {
    private final class02135 N;
    private int y;

    public class04133(class02135 class021352) {
        if (class021352.y() <= 1) {
            throw new IllegalArgumentException();
        }
        this.N = class021352;
    }

    public boolean N(class06069 class060692) {
        if (this.y == 0) {
            this.y = this.N.N(class060692) - 1;
            return false;
        }
        return --this.y == 0;
    }
}

