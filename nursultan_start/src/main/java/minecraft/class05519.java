/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class05511;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05519
extends class05511 {
    private final class07209 L;
    private final class07209 u;

    public @Nullable class07209 L() {
        return this.u;
    }

    public class05519(class00392 class003922, class07209 class072092, class07209 class072093, int n) {
        super(class003922, n);
        this.L = class072092;
        this.u = class072093;
    }

    public @Nullable class07209 u() {
        return this.L;
    }

    public class00392 y() {
        return this.N;
    }

    @Override
    public class00392 N() {
        return class00392.N((String)"test.error.position", (Object[])new Object[]{this.N, this.L.method_10263(), this.L.method_10264(), this.L.method_10260(), this.u.method_10263(), this.u.method_10264(), this.u.method_10260(), this.y});
    }
}

