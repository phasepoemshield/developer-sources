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
 *  minecraft.class02477
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04206
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08909
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02477;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04206;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public final class class08902
extends Record
implements class08909 {
    private final class02477<?> componentType;
    private final boolean ignoreDefault;
    public static final MapCodec<class08902> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.NW.T().fieldOf("component").forGetter(class08902::y), (App)Codec.BOOL.optionalFieldOf("ignore_default", (Object)false).forGetter(class08902::L)).apply(instance, class08902::new));

    public boolean L() {
        return this.ignoreDefault;
    }

    public class08902(class02477<?> class024772, boolean bl) {
        this.componentType = class024772;
        this.ignoreDefault = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08902.class, "componentType;ignoreDefault", "componentType", "ignoreDefault"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08902.class, "componentType;ignoreDefault", "componentType", "ignoreDefault"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08902.class, "componentType;ignoreDefault", "componentType", "ignoreDefault"}, this);
    }

    public class02477<?> y() {
        return this.componentType;
    }

    public MapCodec<class08902> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return this.ignoreDefault ? class065842.N(this.componentType) : class065842.L(this.componentType);
    }
}

