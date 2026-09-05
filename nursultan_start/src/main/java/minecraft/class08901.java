/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class03817
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08909
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class03817;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public record class08901() implements class08909
{
    public static final MapCodec<class08901> N = MapCodec.unit((Object)((Object)new class08901()));

    public MapCodec<class08901> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        if (class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            if (class080362.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 != null) {
                class07070 class070702 = class03817.N((class08036)class080362);
                return class074382.method_61420(class070702) == class065842;
            }
        }
        return false;
    }
}

