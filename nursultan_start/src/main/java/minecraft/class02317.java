/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class02320;
import minecraft.class02339;
import minecraft.class06069;

record class02317() implements class02339
{
    public static final class02317 N = new class02317();
    public static final Codec<class02317> y = MapCodec.unitCodec((Object)N);
    public static final class02320 L = new class02320(class01894.y((String)"ore_drops"), y);

    @Override
    public int N(class06069 class060692, int n, int n2) {
        if (n2 > 0) {
            int n3 = class060692.y(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return n * (n3 + 1);
        }
        return n;
    }

    @Override
    public class02320 N() {
        return L;
    }
}

