/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06261
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class06261;

final class class04886
extends Record {
    final List<class06261> providers;
    public static final Codec<class04886> y = RecordCodecBuilder.create(instance -> instance.group((App)class06261.N.listOf().fieldOf("providers").forGetter(class04886::N)).apply(instance, class04886::new));

    private class04886(List<class06261> list) {
        this.providers = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04886.class, "providers", "providers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04886.class, "providers", "providers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04886.class, "providers", "providers"}, this);
    }

    public List<class06261> N() {
        return this.providers;
    }
}

