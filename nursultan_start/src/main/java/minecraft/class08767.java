/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00331
 *  minecraft.class00335
 *  minecraft.class00368
 *  minecraft.class01097
 *  minecraft.class01140
 *  minecraft.class03359
 *  minecraft.class07030
 *  minecraft.class07032
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00368;
import minecraft.class01097;
import minecraft.class01140;
import minecraft.class03359;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class08779;
import org.jspecify.annotations.Nullable;

public record class08767() implements class00335
{
    public static final MapCodec<class08767> N = MapCodec.unit(class08767::new);

    public MapCodec<class08767> N() {
        return N;
    }

    public @Nullable class00368<?> N(class00331 class003312) {
        class01097 class010972 = class03359.N((class01140)class003312.y(), (class07030)class07032.field_11510);
        if (class010972 == null) {
            return null;
        }
        return new class08779(class003312.u(), class010972);
    }
}

