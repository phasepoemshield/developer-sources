/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class08405
 */
package minecraft;

import minecraft.class00392;
import minecraft.class08405;

public class class05511
extends class08405 {
    protected final class00392 N;
    protected final int y;

    public class05511(class00392 class003922, int n) {
        super(class003922.getString());
        this.N = class003922;
        this.y = n;
    }

    public String getMessage() {
        return this.N().getString();
    }

    public class00392 N() {
        return class00392.N((String)"test.error.tick", (Object[])new Object[]{this.N, this.y});
    }
}

