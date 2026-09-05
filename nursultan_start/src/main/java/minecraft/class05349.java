/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08209
 *  minecraft.class08237
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08209;
import minecraft.class08237;

public final class class05349
extends Record
implements class08237 {
    private final int nutrition;
    private final float saturation;
    private final boolean canAlwaysEat;
    public static final Codec<class05349> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("nutrition").forGetter(class05349::N), (App)Codec.FLOAT.fieldOf("saturation").forGetter(class05349::y), (App)Codec.BOOL.optionalFieldOf("can_always_eat", (Object)false).forGetter(class05349::L)).apply(instance, class05349::new));
    public static final class02362<class04247, class05349> y = class02362.N((class02362)class02389.B, class05349::N, (class02362)class02389.E, class05349::y, (class02362)class02389.y, class05349::L, class05349::new);

    public boolean L() {
        return this.canAlwaysEat;
    }

    public class05349(int n, float f, boolean bl) {
        this.nutrition = n;
        this.saturation = f;
        this.canAlwaysEat = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05349.class, "nutrition;saturation;canAlwaysEat", "nutrition", "saturation", "canAlwaysEat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05349.class, "nutrition;saturation;canAlwaysEat", "nutrition", "saturation", "canAlwaysEat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05349.class, "nutrition;saturation;canAlwaysEat", "nutrition", "saturation", "canAlwaysEat"}, this);
    }

    public float y() {
        return this.saturation;
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, class08209 class082092) {
        class06069 class060692 = class074382.method_59922();
        class072992.method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), (class04891)class082092.i().N(), class04911.field_15254, 1.0f, class060692.N(1.0f, 0.4f));
        if (class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            class080362.method_7344().N(this);
            class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.GS, class04911.field_15248, 0.5f, class04995.y((class06069)class060692, (float)0.9f, (float)1.0f));
        }
    }

    public int N() {
        return this.nutrition;
    }
}

