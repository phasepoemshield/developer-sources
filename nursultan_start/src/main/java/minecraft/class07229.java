/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class06333
 *  minecraft.class06779
 *  minecraft.class06809
 *  minecraft.class07220
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class06333;
import minecraft.class06779;
import minecraft.class06809;
import minecraft.class07220;

public class class07229<C> {
    public static final class07229<class02796> N = new class07229().N(class01894.y((String)"function"), class06779.N).N(class01894.y((String)"function_tag"), class06809.N);
    private final class06333<class01894, MapCodec<? extends class07220<C>>> y = new class06333();
    private final Codec<class07220<C>> L = this.y.N(class01894.N).dispatch("Type", class07220::N, Function.identity());

    public class07229<C> N(class01894 class018942, MapCodec<? extends class07220<C>> mapCodec) {
        this.y.N((Object)class018942, mapCodec);
        return this;
    }

    public Codec<class07220<C>> N() {
        return this.L;
    }
}

