/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00334
 *  minecraft.class03448
 *  minecraft.class06572
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07438
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00334;
import minecraft.class03448;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07438;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08897
implements class06572 {
    public static final MapCodec<class08897> N = MapCodec.unit((Object)new class08897());

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class07438 class074382;
        class07438 class074383 = class074382 = class089612 == null ? null : class089612.method_72393();
        if (class074382 == null) {
            return 0.0f;
        }
        if (class06593.u((class06584)class065842)) {
            return 0.0f;
        }
        int n2 = class06593.y((class06584)class065842, (class07438)class074382);
        return (float)class00334.N((class06584)class065842, (class07438)class074382) / (float)n2;
    }

    public MapCodec<class08897> N() {
        return N;
    }
}

