/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class04196
 *  minecraft.class04201
 *  minecraft.class04205
 *  minecraft.class04214
 *  minecraft.class06338
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class04196;
import minecraft.class04201;
import minecraft.class04205;
import minecraft.class04214;
import minecraft.class04224;
import minecraft.class04233;
import minecraft.class06338;
import org.slf4j.Logger;

public final class class04234
extends Record
implements class04233 {
    private final class01894 resource;
    private final List<class04201> regions;
    private final double xDivisor;
    private final double yDivisor;
    static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class04234> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("resource").forGetter(class04234::y), (App)class06338.y((Codec)class04201.R.listOf()).fieldOf("regions").forGetter(class04234::L), (App)Codec.DOUBLE.optionalFieldOf("divisor_x", (Object)1.0).forGetter(class04234::u), (App)Codec.DOUBLE.optionalFieldOf("divisor_y", (Object)1.0).forGetter(class04234::i)).apply(instance, class04234::new));

    public List<class04201> L() {
        return this.regions;
    }

    public class04234(class01894 class018942, List<class04201> list, double d, double d2) {
        this.resource = class018942;
        this.regions = list;
        this.xDivisor = d;
        this.yDivisor = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04234.class, "resource;regions;xDivisor;yDivisor", "resource", "regions", "xDivisor", "yDivisor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04234.class, "resource;regions;xDivisor;yDivisor", "resource", "regions", "xDivisor", "yDivisor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04234.class, "resource;regions;xDivisor;yDivisor", "resource", "regions", "xDivisor", "yDivisor"}, this);
    }

    public double i() {
        return this.yDivisor;
    }

    public double u() {
        return this.xDivisor;
    }

    public class01894 y() {
        return this.resource;
    }

    @Override
    public void N(class01089 class010892, class04205 class042052) {
        class01894 class018942 = N.N(this.resource);
        Optional optional = class010892.method_14486(class018942);
        if (optional.isPresent()) {
            class04224 class042242 = new class04224(class018942, (class01079)optional.get(), this.regions.size());
            for (class04201 class042012 : this.regions) {
                class042052.N(class042012.N(), (class04214)new class04196(class042242, class042012, this.xDivisor, this.yDivisor));
            }
        } else {
            y.warn("Missing sprite: {}", (Object)class018942);
        }
    }

    public MapCodec<class04234> N() {
        return L;
    }
}

