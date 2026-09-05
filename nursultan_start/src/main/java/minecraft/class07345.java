/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07332
 *  minecraft.class07341
 */
package minecraft;

import minecraft.class07332;
import minecraft.class07341;
import minecraft.class07353;

public sealed interface class07345
extends AutoCloseable
permits class07332, class07353, class07341 {
    @Override
    default public void close() {
    }
}

