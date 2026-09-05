/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02065
 *  minecraft.class03409
 *  minecraft.class05096
 */
package minecraft;

import java.time.Instant;
import java.util.UUID;
import minecraft.class02065;
import minecraft.class03409;
import minecraft.class03743;
import minecraft.class05096;

public class class03732
extends class02065 {
    private final String N;

    public class03732 y() {
        class03732 class037322 = new class03732(this.y, this.L, this.u, this.N);
        class037322.i = this.i;
        class037322.M = this.M;
        return class037322;
    }

    class03732(UUID uUID, Instant instant, UUID uUID2, String string) {
        super(uUID, instant, uUID2);
        this.N = string;
    }

    public class05096 N(class05096 class050962, class03409 class034092) {
        return new class03743(class050962, class034092, this);
    }

    public String N() {
        return this.N;
    }
}

