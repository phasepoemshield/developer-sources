/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01650;
import minecraft.class01655;

public record class01670() implements class01650
{
    public static final MapCodec<class01670> L = MapCodec.unit(class01670::new);

    @Override
    public class01655 N() {
        return class01655.field_45656;
    }
}

