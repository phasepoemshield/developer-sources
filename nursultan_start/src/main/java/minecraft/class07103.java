/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07126;

public abstract class class07103<T extends class07126> {
    private final boolean field_11196;

    public class07103(boolean bl) {
        this.field_11196 = bl;
    }

    public abstract MapCodec<T> method_29138();

    public boolean method_10299() {
        return this.field_11196;
    }

    public abstract class02362<? super class04247, T> method_56179();
}

