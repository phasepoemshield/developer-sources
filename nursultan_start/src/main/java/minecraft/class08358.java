/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00502
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06338
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08843
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00502;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08358
extends Record
implements class08843 {
    private final int defaultColor;
    public static final MapCodec<class08358> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("default").forGetter(class08358::y)).apply(instance, class08358::new));

    public class08358(int n) {
        this.defaultColor = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08358.class, "defaultColor", "defaultColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08358.class, "defaultColor", "defaultColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08358.class, "defaultColor", "defaultColor"}, this);
    }

    public int y() {
        return this.defaultColor;
    }

    public MapCodec<class08358> N() {
        return N;
    }

    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        class06541 class065412;
        class00502 class005022;
        if (class074382 != null && (class005022 = class074382.method_5781()) != null && (class065412 = class005022.P()).i() != null) {
            return class02566.M((int)class065412.i());
        }
        return class02566.M((int)this.defaultColor);
    }
}

