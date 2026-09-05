/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01471
 *  minecraft.class01473
 *  minecraft.class02136
 *  minecraft.class04540
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class01471;
import minecraft.class01473;
import minecraft.class02136;
import minecraft.class04540;
import minecraft.class06069;
import minecraft.class07209;

public class class01461
extends class01471 {
    public static final MapCodec<class01461> y = class04540.y((Codec)class00500.N).comapFlatMap(class01461::N, class014612 -> class014612.L).fieldOf("entries");
    private final class04540<class00500> L;

    public class01461(class02136<class00500> class021362) {
        this((class04540<class00500>)class021362.N());
    }

    public class01461(class04540<class00500> class045402) {
        this.L = class045402;
    }

    private static DataResult<class01461> N(class04540<class00500> class045402) {
        if (class045402.L()) {
            return DataResult.error(() -> "WeightedStateProvider with no states");
        }
        return DataResult.success((Object)((Object)new class01461(class045402)));
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        return (class00500)this.L.y(class060692);
    }

    protected class01473<?> N() {
        return class01473.y;
    }
}

