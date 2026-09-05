/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03382
 */
package minecraft;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import minecraft.class03382;

public interface class03393
extends class03382,
LongSupplier {
    default public long get(TimeUnit timeUnit) {
        return timeUnit.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
    }
}

