/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00343
 *  minecraft.class00373
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06289
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00343;
import minecraft.class00373;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06289;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08934;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08919
extends class00343 {
    public static final MapCodec<class08919> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("wobble", (Object)true).forGetter(class00343::y), (App)class08934.field_55393.fieldOf("target").forGetter(class08919::N)).apply(instance, class08919::new));
    private final class00373 y;
    private final class00373 L;
    private final class08934 u;
    private final class06069 i = class06069.u();

    public class08919(boolean bl, class08934 class089342) {
        super(bl);
        this.y = this.N(0.8f);
        this.L = this.N(0.8f);
        this.u = class089342;
    }

    private static float N(class08961 class089612) {
        return class04995.L((float)(class089612.method_73188() / 360.0f), (float)1.0f);
    }

    private static int N(int n) {
        return n * 1327217883;
    }

    protected class08934 N() {
        return this.u;
    }

    private static double N(class08961 class089612, class07209 class072092) {
        class06889 class068892 = class06889.y((class00753)class072092);
        class06889 class068893 = class089612.method_73189();
        return Math.atan2(class068892.L() - class068893.L(), class068892.N() - class068893.N()) / 6.2831854820251465;
    }

    private float N(int n, long l) {
        if (this.L.N(l)) {
            this.L.N(l, this.i.z());
        }
        return class04995.L((float)(this.L.N() + (float)class08919.N(n) / 2.14748365E9f), (float)1.0f);
    }

    private float N(class08961 class089612, long l, class07209 class072092) {
        float f;
        class08036 class080362;
        float f2 = (float)class08919.N(class089612, class072092);
        float f3 = class08919.N(class089612);
        class07438 class074382 = class089612.method_72393();
        if (class074382 instanceof class08036 && (class080362 = (class08036)class074382).method_7340() && class080362.method_73183().method_54719().Z()) {
            if (this.y.N(l)) {
                this.y.N(l, 0.5f - (f3 - 0.25f));
            }
            f = f2 + this.y.N();
        } else {
            f = 0.5f - (f3 - 0.25f - f2);
        }
        return class04995.L((float)f, (float)1.0f);
    }

    private static boolean N(class08961 class089612, @Nullable class06289 class062892) {
        return class062892 != null && class062892.N() == class089612.method_73183().method_27983() && !(class062892.y().method_19770((class00737)class089612.method_73189()) < (double)1.0E-5f);
    }

    protected float N(class06584 class065842, class03448 class034482, int n, class08961 class089612) {
        class06289 class062892 = this.u.N(class034482, class065842, class089612);
        long l = class034482.N();
        if (!class08919.N(class089612, class062892)) {
            return this.N(n, l);
        }
        return this.N(class089612, l, class062892.y());
    }
}

