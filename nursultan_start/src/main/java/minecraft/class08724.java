/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04701
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04701;
import minecraft.class08688;

public class class08724
extends class08688 {
    final long N;

    public class08724(long l) {
        this.N = l;
    }

    @Override
    public class00392[] y() {
        return new class00392[]{class00392.L((String)"mco.upload.failed.too_big.title"), class00392.N((String)"mco.upload.failed.too_big.description", (Object[])new Object[]{class04701.y((long)this.N, (class04701)class04701.N((long)this.N))})};
    }
}

