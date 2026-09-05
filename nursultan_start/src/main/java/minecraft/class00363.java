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
 *  minecraft.class02841
 *  minecraft.class03448
 *  minecraft.class03662
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
import minecraft.class02841;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06584;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class00363
extends Record
implements class00372<String> {
    private final String property;
    public static final PrimitiveCodec<String> N = Codec.STRING;
    public static final class00336<class00363, String> y = class00336.N(RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("block_state_property").forGetter(class00363::L)).apply(instance, class00363::new)), N);

    public String L() {
        return this.property;
    }

    public class00363(String string) {
        this.property = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00363.class, "property", "property"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00363.class, "property", "property"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00363.class, "property", "property"}, this);
    }

    @Override
    public Codec<String> y() {
        return N;
    }

    @Override
    public class00336<class00363, String> N() {
        return y;
    }

    @Override
    public @Nullable String y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        class02841 class028412 = (class02841)class065842.method_58694(class02484.Nl);
        if (class028412 == null) {
            return null;
        }
        return (String)class028412.y().get(this.property);
    }
}

