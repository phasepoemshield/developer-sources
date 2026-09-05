/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01631
 *  minecraft.class02065
 *  minecraft.class03409
 *  minecraft.class03724
 *  minecraft.class05096
 */
package minecraft;

import java.time.Instant;
import java.util.UUID;
import java.util.function.Supplier;
import minecraft.class01631;
import minecraft.class02065;
import minecraft.class03409;
import minecraft.class03724;
import minecraft.class05096;

public class class03744
extends class02065 {
    final Supplier<class01631> N;

    public class03744 y() {
        class03744 class037442 = new class03744(this.y, this.L, this.u, this.N);
        class037442.i = this.i;
        class037442.R = this.R;
        class037442.M = this.M;
        return class037442;
    }

    class03744(UUID uUID, Instant instant, UUID uUID2, Supplier<class01631> supplier) {
        super(uUID, instant, uUID2);
        this.N = supplier;
    }

    public class05096 N(class05096 class050962, class03409 class034092) {
        return new class03724(class050962, class034092, this);
    }

    public Supplier<class01631> N() {
        return this.N;
    }
}

