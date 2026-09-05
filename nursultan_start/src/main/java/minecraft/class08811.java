/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06338
 *  minecraft.class06517
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08811
extends Record
implements class08843 {
    private final int defaultColor;
    public static final MapCodec<class08811> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("default").forGetter(class08811::y)).apply(instance, class08811::new));

    public class08811() {
        this(-13083194);
    }

    public class08811(int n) {
        this.defaultColor = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08811.class, "defaultColor", "defaultColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08811.class, "defaultColor", "defaultColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08811.class, "defaultColor", "defaultColor"}, this);
    }

    public int y() {
        return this.defaultColor;
    }

    public MapCodec<class08811> N() {
        return N;
    }

    @Override
    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        class06517 class065172 = (class06517)class065842.method_58694(class02484.h);
        if (class065172 != null) {
            return class02566.M((int)class065172.N(this.defaultColor));
        }
        return class02566.M((int)this.defaultColor);
    }
}

