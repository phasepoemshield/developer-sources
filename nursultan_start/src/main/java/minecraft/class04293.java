/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02273
 *  minecraft.class03289
 *  minecraft.class04016
 *  minecraft.class04383
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02273;
import minecraft.class03289;
import minecraft.class04016;
import minecraft.class04383;
import org.jspecify.annotations.Nullable;

public class class04293 {
    private final class02273 N;
    private final @Nullable class04016<?>[] y;

    public class04293(class02273 class022732) {
        this.N = class022732;
        this.y = new class04016[class03289.N.y(class022732.getClass())];
    }

    public <T> class04293 N(class02131<T> class021312, T t) {
        int n = class021312.N();
        if (n > this.y.length) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + this.y.length + ")");
        }
        if (this.y[n] != null) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        if (class02154.y((class04383)class021312.y()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + String.valueOf(class021312.y()) + " for " + n + "!");
        }
        this.y[class021312.N()] = new class04016(class021312, t);
        return this;
    }

    public class03289 N() {
        for (int i = 0; i < this.y.length; ++i) {
            if (this.y[i] != null) continue;
            throw new IllegalStateException("Entity " + String.valueOf(this.N.getClass()) + " has not defined synched data value " + i);
        }
        return new class03289(this.N, this.y);
    }
}

