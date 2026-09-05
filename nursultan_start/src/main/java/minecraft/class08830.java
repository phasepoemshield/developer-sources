/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class08350
 *  minecraft.class08905
 *  minecraft.class08910
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class08350;
import minecraft.class08809;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;

public record class08830() implements class08895
{
    public static final MapCodec<class08830> N = MapCodec.unit((Object)new class08830());

    public void method_62326(class08350 class083502) {
    }

    public MapCodec<class08830> method_65585() {
        return N;
    }

    @Override
    public class08910 method_65587(class08905 class089052) {
        return class08809.N;
    }
}

