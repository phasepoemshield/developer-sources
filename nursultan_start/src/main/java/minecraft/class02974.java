/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03767
 *  minecraft.class03794
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02968;
import minecraft.class03767;
import minecraft.class03794;

public final class class02974
extends Record {
    private final class03767 flags;
    private static final Codec<class02974> L = RecordCodecBuilder.create(instance -> instance.group((App)class03794.R.fieldOf("enabled").forGetter(class02974::N)).apply(instance, class02974::new));
    public static final class02968<class02974> N = new class02968<class02974>("features", L);

    public class02974(class03767 class037672) {
        this.flags = class037672;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02974.class, "flags", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02974.class, "flags", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02974.class, "flags", "flags"}, this);
    }

    public class03767 N() {
        return this.flags;
    }
}

