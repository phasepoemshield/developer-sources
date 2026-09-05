/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.PrimitiveCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02484
 *  minecraft.class02845
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class02484;
import minecraft.class02845;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class00371
extends Record
implements class00372<String> {
    private final int index;
    public static final PrimitiveCodec<String> N = Codec.STRING;
    public static final class00336<class00371, String> y = class00336.N(RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.optionalFieldOf("index", (Object)0).forGetter(class00371::L)).apply(instance, class00371::new)), N);

    public int L() {
        return this.index;
    }

    public class00371(int n) {
        this.index = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00371.class, "index", "index"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00371.class, "index", "index"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00371.class, "index", "index"}, this);
    }

    @Override
    public Codec<String> y() {
        return N;
    }

    @Override
    public class00336<class00371, String> N() {
        return y;
    }

    @Override
    public @Nullable String y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        class02845 class028452 = (class02845)class065842.method_58694(class02484.j);
        if (class028452 != null) {
            return class028452.L(this.index);
        }
        return null;
    }
}

