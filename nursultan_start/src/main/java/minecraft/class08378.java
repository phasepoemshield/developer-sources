/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00336
 *  minecraft.class00372
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public record class08378() implements class00372<class05946<class07299>>
{
    public static final Codec<class05946<class07299>> N = class05946.N((class05946)class04227.yg);
    public static final class00336<class08378, class05946<class07299>> y = class00336.N((MapCodec)MapCodec.unit((Object)((Object)new class08378())), N);

    public Codec<class05946<class07299>> y() {
        return N;
    }

    public class00336<class08378, class05946<class07299>> N() {
        return y;
    }

    public @Nullable class05946<class07299> y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return class034482 != null ? class034482.method_27983() : null;
    }
}

