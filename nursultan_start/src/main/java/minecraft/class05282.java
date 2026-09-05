/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class01339
 *  minecraft.class05487
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class01339;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05282
extends class01219 {
    public static final MapCodec<class05282> N = class00500.N.xmap(class01339::i, class00891::W).listOf().fieldOf("blocks").xmap(class05282::new, class052822 -> class052822.i);
    public static final class05282 y = new class05282((List<class00891>)ImmutableList.of((Object)class00869.sh));
    public static final class05282 L = new class05282((List<class00891>)ImmutableList.of((Object)class00869.N));
    public static final class05282 u = new class05282((List<class00891>)ImmutableList.of((Object)class00869.N, (Object)class00869.sh));
    private final ImmutableList<class00891> i;

    public class05282(List<class00891> list) {
        this.i = ImmutableList.copyOf(list);
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        if (this.i.contains((Object)class012283.y().i())) {
            return null;
        }
        return class012283;
    }

    protected class05235<?> N() {
        return class05235.i;
    }
}

