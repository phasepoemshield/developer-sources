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
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03689
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03689;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class07072;

public final class class08565
extends Record {
    private final float horizontalBlockingAngle;
    private final Optional<class03543<class03689>> type;
    private final float base;
    private final float factor;
    public static final Codec<class08565> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.t.optionalFieldOf("horizontal_blocking_angle", (Object)Float.valueOf(90.0f)).forGetter(class08565::N), (App)class03541.N((class05946)class04227.yN).optionalFieldOf("type").forGetter(class08565::y), (App)Codec.FLOAT.fieldOf("base").forGetter(class08565::L), (App)Codec.FLOAT.fieldOf("factor").forGetter(class08565::u)).apply(instance, class08565::new));
    public static final class02362<class04247, class08565> y = class02362.N((class02362)class02389.E, class08565::N, (class02362)class02389.L((class05946)class04227.yN).N_33(class02389::N), class08565::y, (class02362)class02389.E, class08565::L, (class02362)class02389.E, class08565::u, class08565::new);

    public float L() {
        return this.base;
    }

    public class08565(float f, Optional<class03543<class03689>> optional, float f2, float f3) {
        this.horizontalBlockingAngle = f;
        this.type = optional;
        this.base = f2;
        this.factor = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08565.class, "horizontalBlockingAngle;type;base;factor", "horizontalBlockingAngle", "type", "base", "factor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08565.class, "horizontalBlockingAngle;type;base;factor", "horizontalBlockingAngle", "type", "base", "factor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08565.class, "horizontalBlockingAngle;type;base;factor", "horizontalBlockingAngle", "type", "base", "factor"}, this);
    }

    public float u() {
        return this.factor;
    }

    public Optional<class03543<class03689>> y() {
        return this.type;
    }

    public float N() {
        return this.horizontalBlockingAngle;
    }

    public float N(class07072 class070722, float f, double d) {
        if (d > (double)((float)Math.PI / 180 * this.horizontalBlockingAngle)) {
            return 0.0f;
        }
        if (this.type.isPresent() && !this.type.get().N(class070722.E())) {
            return 0.0f;
        }
        return class04995.N((float)(this.base + this.factor * f), (float)0.0f, (float)f);
    }
}

