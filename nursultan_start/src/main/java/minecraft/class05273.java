/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class04995;
import minecraft.class05235;
import minecraft.class05265;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05273
extends class01219 {
    public static final MapCodec<class05273> N = class05265.y.listOf().fieldOf("rules").xmap(class05273::new, class052732 -> class052732.y);
    private final ImmutableList<class05265> y;

    public class05273(List<? extends class05265> list) {
        this.y = ImmutableList.copyOf(list);
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class06069 class060692 = class06069.y((long)class04995.N((class00753)class012283.N()));
        class00500 class005002 = class054872.method_8320(class012283.N());
        for (class05265 class052652 : this.y) {
            if (!class052652.N(class012283.y(), class005002, class012282.N(), class012283.N(), class072093, class060692)) continue;
            return new class01228(class012283.N(), class052652.N(), class052652.N(class060692, class012283.L()));
        }
        return class012283;
    }

    protected class05235<?> N() {
        return class05235.Z;
    }
}

