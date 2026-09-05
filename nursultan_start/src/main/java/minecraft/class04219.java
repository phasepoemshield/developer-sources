/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01089
 *  minecraft.class04233
 *  minecraft.class04421
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01089;
import minecraft.class04205;
import minecraft.class04233;
import minecraft.class04421;

public final class class04219
extends Record
implements class04233 {
    private final class04421 filter;
    public static final MapCodec<class04219> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04421.N.fieldOf("pattern").forGetter(class04219::y)).apply(instance, class04219::new));

    public class04219(class04421 class044212) {
        this.filter = class044212;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04219.class, "filter", "filter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04219.class, "filter", "filter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04219.class, "filter", "filter"}, this);
    }

    public class04421 y() {
        return this.filter;
    }

    public MapCodec<class04219> N() {
        return y;
    }

    public void N(class01089 class010892, class04205 class042052) {
        class042052.N(this.filter.L());
    }
}

