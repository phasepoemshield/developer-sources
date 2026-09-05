/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02816
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
import minecraft.class02816;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08840
extends Record
implements class08843 {
    private final int defaultColor;
    public static final MapCodec<class08840> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("default").forGetter(class08840::y)).apply(instance, class08840::new));

    public class08840(int n) {
        this.defaultColor = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08840.class, "defaultColor", "defaultColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08840.class, "defaultColor", "defaultColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08840.class, "defaultColor", "defaultColor"}, this);
    }

    public int y() {
        return this.defaultColor;
    }

    public MapCodec<class08840> N() {
        return N;
    }

    @Override
    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        return class02816.N((class06584)class065842, (int)this.defaultColor);
    }
}

