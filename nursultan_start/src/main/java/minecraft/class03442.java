/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00891
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06391
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00891;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06391;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class03442
extends class01219 {
    public final class03530<class00891> N;
    public static final MapCodec<class03442> y = class03530.y((class05946)class04227.Z).xmap(class03442::new, class034422 -> class034422.N).fieldOf("value");

    public class03442(class03530<class00891> class035302) {
        this.N = class035302;
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        if (class06391.N(this.N).test(class054872.method_8320(class012283.N()))) {
            return class012283;
        }
        return null;
    }

    protected class05235<?> N() {
        return class05235.m;
    }
}

