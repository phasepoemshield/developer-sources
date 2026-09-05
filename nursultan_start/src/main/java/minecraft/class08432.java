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

public class class08432
extends class08405 {
    private final Throwable N;

    public class08432(Throwable throwable) {
        super(throwable.getMessage());
        this.N = throwable;
    }

    public class00392 N() {
        return class00392.N((String)"test.error.unknown", (Object[])new Object[]{this.N.getMessage()});
    }
}

