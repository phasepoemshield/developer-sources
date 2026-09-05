/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01247
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01247;
import minecraft.class03767;
import minecraft.class03794;

public final class class03776
extends Record {
    private final class01247 dataPacks;
    private final class03767 enabledFeatures;
    public static final String N = "enabled_features";
    public static final MapCodec<class03776> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01247.y.lenientOptionalFieldOf("DataPacks", (Object)class01247.N).forGetter(class03776::N), (App)class03794.R.lenientOptionalFieldOf(N, (Object)class03794.B).forGetter(class03776::y)).apply(instance, class03776::new));
    public static final Codec<class03776> L = y.codec();
    public static final class03776 u = new class03776(class01247.N, class03794.B);

    public class03776(class01247 class012472, class03767 class037672) {
        this.dataPacks = class012472;
        this.enabledFeatures = class037672;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03776.class, "dataPacks;enabledFeatures", "dataPacks", "enabledFeatures"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03776.class, "dataPacks;enabledFeatures", "dataPacks", "enabledFeatures"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03776.class, "dataPacks;enabledFeatures", "dataPacks", "enabledFeatures"}, this);
    }

    public class03767 y() {
        return this.enabledFeatures;
    }

    public class01247 N() {
        return this.dataPacks;
    }

    public class03776 N(class03767 class037672) {
        return new class03776(this.dataPacks, this.enabledFeatures.L(class037672));
    }
}

