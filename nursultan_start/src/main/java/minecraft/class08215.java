/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08200;
import minecraft.class08217;

public record class08215() implements class08200
{
    public static final class08215 N = new class08215();
    public static final MapCodec<class08215> y = MapCodec.unit((Object)N);
    public static final class02362<class04247, class08215> L = class02362.N((Object)N);

    public class08217<class08215> N() {
        return class08217.L;
    }

    @Override
    public boolean N(class07299 class072992, class06584 class065842, class07438 class074382) {
        return class074382.method_6012();
    }
}

