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
 *  minecraft.class02845
 *  minecraft.class03448
 *  minecraft.class06338
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
import minecraft.class02845;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08818
extends Record
implements class08843 {
    private final int index;
    private final int defaultColor;
    public static final MapCodec<class08818> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.optionalFieldOf("index", (Object)0).forGetter(class08818::y), (App)class06338.E.fieldOf("default").forGetter(class08818::L)).apply(instance, class08818::new));

    public int L() {
        return this.defaultColor;
    }

    public class08818(int n, int n2) {
        this.index = n;
        this.defaultColor = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08818.class, "index;defaultColor", "index", "defaultColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08818.class, "index;defaultColor", "index", "defaultColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08818.class, "index;defaultColor", "index", "defaultColor"}, this);
    }

    public int y() {
        return this.index;
    }

    public MapCodec<class08818> N() {
        return N;
    }

    @Override
    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        Integer n;
        class02845 class028452 = (class02845)class065842.method_58694(class02484.j);
        if (class028452 != null && (n = class028452.u(this.index)) != null) {
            return class02566.M((int)n);
        }
        return class02566.M((int)this.defaultColor);
    }
}

