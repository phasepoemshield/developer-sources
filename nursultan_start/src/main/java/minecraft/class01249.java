/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01219
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public class class01249
extends class01219 {
    public static final MapCodec<class01249> N = MapCodec.unit(() -> y);
    public static final class01249 y = new class01249();

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class07209 class072094 = class012283.N();
        if (class054872.method_8320(class072094).N(class00869.V) && !class00891.N((class00494)class012283.y().R((class07290)class054872, class072094))) {
            return new class01228(class072094, class00869.V.W(), class012283.L());
        }
        return class012283;
    }

    protected class05235<?> N() {
        return class05235.W;
    }
}

