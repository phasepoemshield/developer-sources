/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06165
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06165;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08200;
import minecraft.class08217;

public final class class08235
extends Record
implements class08200 {
    private final float diameter;
    private static final float R = 16.0f;
    public static final MapCodec<class08235> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.t.optionalFieldOf("diameter", (Object)Float.valueOf(16.0f)).forGetter(class08235::y)).apply(instance, class08235::new));
    public static final class02362<class04247, class08235> y = class02362.N((class02362)class02389.E, class08235::y, class08235::new);

    public class08235() {
        this(16.0f);
    }

    public class08235(float f) {
        this.diameter = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08235.class, "diameter", "diameter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08235.class, "diameter", "diameter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08235.class, "diameter", "diameter"}, this);
    }

    public float y() {
        return this.diameter;
    }

    @Override
    public boolean N(class07299 class072992, class06584 class065842, class07438 class074382) {
        boolean bl = false;
        for (int i = 0; i < 16; ++i) {
            class04911 class049112;
            class04891 class048912;
            double d = class074382.method_23317() + (class074382.method_59922().U() - 0.5) * (double)this.diameter;
            double d2 = class04995.N((double)(class074382.method_23318() + (class074382.method_59922().U() - 0.5) * (double)this.diameter), (double)class072992.method_31607(), (double)(class072992.method_31607() + ((class04782)class072992).method_32819() - 1));
            double d3 = class074382.method_23321() + (class074382.method_59922().U() - 0.5) * (double)this.diameter;
            if (class074382.method_5765()) {
                class074382.method_5848();
            }
            class06889 class068892 = class074382.method_73189();
            if (!class074382.method_6082(d, d2, d3, true)) continue;
            class072992.method_32888((class03556)class01194.F, class068892, class01164.N((class07049)class074382));
            if (class074382 instanceof class06165) {
                class048912 = class04909.Eu;
                class049112 = class04911.field_15254;
            } else {
                class048912 = class04909.Rq;
                class049112 = class04911.field_15248;
            }
            class072992.method_54762(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class048912, class049112);
            class074382.method_38785();
            bl = true;
            break;
        }
        if (bl && class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            class080362.method_58396();
        }
        return bl;
    }

    public class08217<class08235> N() {
        return class08217.u;
    }
}

